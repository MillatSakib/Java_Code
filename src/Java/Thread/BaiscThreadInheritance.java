/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Thread;

/**
 *
 * @author Sakib
 */


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}

public class BaiscThreadInheritance {
    public static void main(String[] args) {
        MyThread thread = new MyThread(); // Create a Thread object
        thread.start();                  // Start the thread

        System.out.println("Main Thread is running...");
    }
}