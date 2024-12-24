/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Thread;

/**
 *
 * @author Sakib
 */
class ExtendedThread extends Thread {
    @Override
    public void run(){
    String currentThreadName = Thread.currentThread().getName();
        System.out.println("Thread name: "+currentThreadName);
    }
    
}
public class CurrentThread {
    public static void main(String[] args){
        ExtendedThread extendedThread = new ExtendedThread();
        extendedThread.setName("Extended Thead");
        extendedThread.start();
    }
}