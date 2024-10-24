/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.OOP;

/**
 *
 * @author Sakib
 */

abstract class Animal{
    private int legs;
    
    public Animal(int legs){
    this.legs = legs;
    }
    
    public abstract String getDiets();
}

class Lion extends Animal{
    public Lion(int legs){
    super(legs);
    }
    @Override 
    public String getDiets(){
    return "Meat";
    }
}



public class Abstraction {
    public static void main(String[] args){
        Lion lion = new Lion(4);
        System.out.println(lion.getDiets());
    }
    
}
