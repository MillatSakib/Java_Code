/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Thread;

/**
 *
 * @author Sakib
 */
public class ThreadUsingLamdaExpression {
    public static void main(String[] args){
    Thread t1 = new Thread(new Runnable(){
    @Override
    public void run(){
    doWork();
    }
    });
    
    t1.start();
    
    Thread t2 = new Thread(()->{
    doWork();
    });
    t2.start();
    }
    
    private static void doWork(){
        System.out.println("Doing some important work");
    }
}
