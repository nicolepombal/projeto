/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EventoLouça;

/**
 *
 * @author Igor Ribeiro
 */
public class MinutoLouça implements Runnable {
 private volatile boolean exit = false; // Use volatile to ensure visibility across threads

    @Override
    public void run() {
         int i = Integer.parseInt(TelaLouça.txtMinLouça.getText());
         while (!exit){
            TelaLouça.txtMinLouça.setText(i+"");
            i++;
            if(i==59)
                i=0;
            try {
                Thread.sleep(60000); // Sleep for 60 seconds (1 minute)
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
