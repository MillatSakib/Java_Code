/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Thread;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Sakib
 */
class ExtendedThread1 extends Thread {
    @Override
    public void run(){
    for(int i=0; i<5; i++){
        System.out.println("["+i+"] Inside "+Thread.currentThread().getName());
        sleepOneSecond();
    }
    }
    
    private static void sleepOneSecond(){
    try{
    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
    
    }catch(InterruptedException e){
    e.printStackTrace();
    }
    }
}

public class ThreadParallaism{
    public static void main(String[] args){
    ExtendedThread1 extendedThread = new ExtendedThread1();
    extendedThread.setName("Extendend Thread");
    extendedThread.start();
    for(int i=0; i<5; i++){
        System.out.println("["+i+"] Inside "+Thread.currentThread().getName());
        sleepOneSecond();
    }
    
    }
        private static void sleepOneSecond(){
    try{
    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
    
    }catch(InterruptedException e){
    e.printStackTrace();
    }
    }
    }