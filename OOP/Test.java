package OOP;


 class Test{
    static int count = 0;  // this is the static variable. We can access the static variable through class. We can also access the value of static variable using object. But it is the property of class. Not an specific object.
    Test(){
        count++;
    }

    void NonStatic(){
        System.out.println("This is Non Static");
        //Static(); //this will not produce any kind of error. Because we call the static method inside a Non-Static method.
    }

    static void Static(){
        //NonStatic();  // This Will Produce error. Because We try to call a non-static method inside a static method.
        System.out.println("This is static.");
    }
    }
    public class LabReport2 {
    public static void main(String[] args){
//        Test a = new Test();
        System.out.println(Test.count);
        Test.Static();
    }
    
}



/**
 * Restriction of static method
 * Static method can't use non static member.
 * "this" and "super" keyword can't be used here.
 * 
 * Why we make the main method as static?
 * We make the main method as static because if we make a static method inside a class then we can call that function without making the object of that class. We can access the method through the class. As the main method we are not make the the object of that class. Compiler directly call that method. That's why we make the main method as static.
 */