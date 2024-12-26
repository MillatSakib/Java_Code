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

class Watch implements Runnable{
private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");
@Override 
public void run(){
while(true){
printCurrentTime();
sleepOneSecond();

if(Thread.interrupted()){
System.out.println("Thread is Inturrpted");
}
}
}
private static void sleepOneSecond(){
try{
Thread.sleep(TimeUnit.SECONDS.toMillis(1));
}catch(InterruptedException ignored){
}
}
private void printCurrentTime(){
String formattedCurrentTime = LocalDateTime.now().format(formatter);
    System.out.println(formattedCurrentTime);
}
}


public class ThreadCloseUsingInturupt {
public static void main(String[] args) throws InterruptedException{
    Thread watchThread = new Thread(new Watch());
    watchThread.start();
    
    Thread.sleep(500);
    watchThread.interrupt();
}    
}
