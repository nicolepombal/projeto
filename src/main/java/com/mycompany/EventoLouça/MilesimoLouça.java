/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EventoLouça;

/**
 *
 * @author Igor Ribeiro
 */
public class MilesimoLouça implements Runnable {
 private volatile boolean exit = false; // Use volatile to ensure visibility across threads

    @Override
    public void run() {
       int i = Integer.parseInt(TelaLouça.txtMilLouça.getText());
         while (!exit){
            TelaLouça.txtMilLouça.setText(i+"");
            i++;
            if(i==1000)
                i=0;
            try {
                Thread.sleep(1); // Sleep for 60 seconds (1 minute)
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
