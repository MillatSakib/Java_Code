/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.OOP;

/**
 *
 * @author Sakib
 */
class GenericClass<T>{

    private T obj;
    GenericClass(T obj){
    this.obj = obj;
    }
    
    public T getObj(){
    return obj;
    }
    
    public void showType(){
        System.out.println("Type of T is: "+obj.getClass().getName());
    }
}

public class Generic {
    public static void main(String[] args){
    GenericClass<Integer> iObj = new GenericClass<Integer>(88);
    iObj.showType();
    int v = iObj.getObj();
    System.out.println("Value: "+v);
    GenericClass<String> strOb = new GenericClass<String>("This is a Generic Tests.");
    strOb.showType();
    String str = strOb.getObj();
    System.out.println("Value: "+str);
    }
}
