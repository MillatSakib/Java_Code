/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*

There are four property of TimeUnit Enum. They are:
1. TimeUnit.NANOSECONDS
2. TimeUnit.MICROSECONDS
3. TimeUnit.MILLISECONDS
4. TimeUnit.SECONDS
5. TimeUnit.MINUTES
6. TimeUnit.HOURS
7. TimeUnit.DAYS

*/
package Java.Thread;

import java.util.concurrent.TimeUnit;
/**
 *
 * @author Sakib
 */

class CricketScoreChecker extends Thread{
private volatile boolean keepChecking = true;
@Override
public void run(){
    while(keepChecking){
        checkScoreAndPrintTheResult();
        try{
        TimeUnit.SECONDS.sleep(1);
        }catch(InterruptedException e){
        e.printStackTrace();
        }
    }
}

private void checkScoreAndPrintTheResult(){
    //here we can implement a complex algorithm and retrive the score from the web page. But we don't go to that approach
    System.out.println("Current score is: BAN 125/2 (10 ov. target 220)");
}
public void shutdown(){
this.keepChecking = false;
}
}

public class SleepThreadUsingTimeUnitEnum {
    public static void main(String[] args){
        CricketScoreChecker cricketScoreChecker = new CricketScoreChecker();
        cricketScoreChecker.start();
        try{
        TimeUnit.HOURS.sleep(8);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        cricketScoreChecker.shutdown();
    }
}
