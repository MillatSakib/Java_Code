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
public class ThreadLocalDemo {
    private ThreadLocal<Integer> number = new ThreadLocal<>();
    
    public Integer getNumber(){
    return number.get();
    }
    
    public void setNumebr(Integer number){
    this.number.set(number);
    }
    
    public static void main(String[] args){
        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();
        setARandomNumber(threadLocalDemo);
        Thread thread1 = new Thread(()->{
            setARandomNumber(threadLocalDemo);
        });
        Thread thread2 = new Thread(()->{
            setARandomNumber(threadLocalDemo);
        });
        
        thread1.start();
        thread2.start();
        try{
        thread1.join();
        thread2.join();
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            throw new AssertionError(e);
        }
        System.out.println("Thread: "+Thread.currentThread().getName());
        System.out.println("Value: "+threadLocalDemo.getNumber());
    }
    
    
    private static void setARandomNumber(ThreadLocalDemo threadLocalDemo){
        threadLocalDemo.setNumebr((int)(Math.random()*100));
        try{
        TimeUnit.SECONDS.sleep(1);
        
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            throw new AssertionError(e);
        }
        System.out.println("Thread: "+Thread.currentThread().getName());
        System.out.println("Value: "+threadLocalDemo.getNumber());
    }
}
