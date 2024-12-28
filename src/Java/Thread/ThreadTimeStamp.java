/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Thread;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class FibonacciTask implements Runnable{

        private long n;
        private String id;
        FibonacciTask(long n, String id){
        this.n = n;
        this.id = id;
        }
        
        private BigDecimal fib(long n){
            if(n==0){
            return BigDecimal.ZERO;
            }else if(n==1){
            return BigDecimal.ONE;
            }else{
            return fib(n-1).add(fib(n-2));
            }
        }
        
        @Override
        public void run(){
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
            System.out.println("String Task "+id+" at"+isoFormatter.format(LocalDateTime.now()));
            BigDecimal fib = fib(n);
            System.out.println("Ending task "+id+" at "+isoFormatter.format(LocalDateTime.now()));
        }
}


/**
 *
 * @author Sakib
 */
public class ThreadTimeStamp {
    public static void main(String[] args) throws InterruptedException{
    Thread t1 = new Thread(new FibonacciTask(45, "FibonacciTask# 1"));
    Thread t2 = new Thread(new FibonacciTask(45, "FibonacciTask# 2"));
    Thread t3 = new Thread(new FibonacciTask(45, "FibonacciTask# 3"));
    Thread t4 = new Thread(new FibonacciTask(45, "FibonacciTask# 4"));
    Thread t5 = new Thread(new FibonacciTask(45, "FibonacciTask# 5"));
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    }
    
}
