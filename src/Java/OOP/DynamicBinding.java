/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.OOP;

/**
 *
 * @author Sakib
 */

class A {
    void callMe(){
        System.out.println("Inside A's collme method.");
    }
}

class B extends A {
    @Override
    void callMe(){
        System.out.println("Inside B's collme method.");
    }
}


class C extends A{
    @Override
    void callMe(){
        System.out.println("Inside C's collme method.");
    }
}


public class DynamicBinding {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        
        A r;
        r= a;
        r.callMe();
        r= b;
        r.callMe();
        r= c;
        r.callMe();
    }
}
