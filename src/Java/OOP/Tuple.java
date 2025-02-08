/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.OOP;

/**
 *
 * @author Sakib
 */
public class Tuple<X,Y> {
    private X x;
    private Y y;
    
    public Tuple(X x, Y y){
    this.x = x;
    this.y = y;
    }
    
    public X getX(){
    return x;
    }
    
    public Y getY(){
    return y;
    }
    
    public void showTypes(){
    
        System.out.println("Type of T is "+x.getClass().getName()+" and Value: "+x);
        System.out.println("Type of  V is "+y.getClass().getName());
        
    }
    
    public static void main(String[] Args){
    Tuple<String, String> tuple = new Tuple<>("Hello","world");
    tuple.showTypes();
    Tuple<String,Integer> person = new Tuple<>("Rahim", 45);
    person.showTypes();
    }
}
