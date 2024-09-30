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

