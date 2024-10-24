/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.ExceptionHandeling;

/**
 *
 * @author Sakib
 */
public class BasicException {
    public static void main(String[] args){
        int a = 1;
        int b = 0;
        
        int result = 0;
        
        try{
        result = devide(a,b);
        }catch(ArithmeticException e){
        System.out.println("You can't devide "+ a + " by "+b);
        }
        System.out.println("Result: "+result);
    }
    public static int devide(int a, int b){
    return a/b;
    }
}
