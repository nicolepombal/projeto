/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EventoEscovarDentes;

/**
 *
 * @author Igor Ribeiro
 */
public class SegundoEscovar implements Runnable{
 private volatile boolean exit = false; // Use volatile to ensure visibility across threads
    
 @Override
    public void run() {
         int i = Integer.parseInt(TelaEscovarDentes.txtSegEscovar.getText());
         while (!exit){
            TelaEscovarDentes.txtSegEscovar.setText(i+"");
            i++;
            if(i==59)
                i=0;
            try {
                Thread.sleep(1000); // Sleep for 60 seconds (1 minute)
            } catch (InterruptedException e) {
                // Thread was interrupted, exit the loop
                exit = true;
            }
    }
}
    public void stop() {
        exit = true;
    }

    public void reset() {
        exit = false;
    }    
}
