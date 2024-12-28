/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Sakib
 */
public class ThreadShutDown {
    
}


class Watch1 implements Runnable{
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");
    private volatile boolean running = true;    //volatile keyword use to ensure the running variable are alawys contains on ram. It don't go to CPU cash never.
    
    @Override
    public void run(){
        while(running){
            printCurrentTime();
            sleepOneSecond();
        }
    
    }
    
    private void sleepOneSecond(){
        try{
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        }catch(InterruptedException e){
        e.printStackTrace();
        }
    }
    
    void printCurrentTime(){
        String formattedCurrentTime = LocalDateTime.now().format(formatter);
        System.out.println(formattedCurrentTime);
    
    }
    
    void shutdown(){
        this.running = false;
    }
    
    public static void main(String[] args) throws InterruptedException{
    Watch1 watch = new Watch1();
    Thread t1 = new Thread(watch);
    t1.start();
    Thread.sleep(5000);
    watch.shutdown();
    }
}