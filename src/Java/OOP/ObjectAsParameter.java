/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sakib
 */
package Java.OOP;

class Time {


    int hour, minute, second;
    
    Time(int hour, int minute, int second){
        if(hour> 24 || minute > 59 || second > 59|| hour< 0 || minute < 0 || second < 0){
            System.out.println("Doesn't initiate perfectly. Please enter correct time");
            System.exit(0);
    }


        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
    }


    void compareTime(Time anotherTime){
        if(anotherTime.hour == this.hour){
            
            if(anotherTime.minute == this.minute){
            if(anotherTime.second == this.second){
                System.out.println("This tow time are totally same");
            }else if(anotherTime.second > this.second){
                System.out.println(anotherTime.hour+" : "+anotherTime.minute+" : "+anotherTime.second+" is getter time");
            }else{System.out.println(this.hour+" : "+this.minute+" : "+this.second+" is getter time");}
            }
            else if(anotherTime.minute > this.minute){
            System.out.println(anotherTime.hour+" : "+anotherTime.minute+" : "+anotherTime.second+" is getter time");
            }else{
            System.out.println(this.hour+" : "+this.minute+" : "+this.second+" is getter time");
            }
        }else if(anotherTime.hour > this.hour){
            System.out.println(anotherTime.hour+" : "+anotherTime.minute+" : "+anotherTime.second+" is getter time");
            }else{
            System.out.println(this.hour+" : "+this.minute+" : "+this.second+" is getter time");
            }
    }
}


public class ObjectAsParameter {
    public static void main(String[] args) {
        Time t1 = new Time(12, 5, 12);
        Time t2 = new Time(12, 5, 20);
        t1.compareTime(t2);
    }    
}
