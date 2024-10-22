package Java.General.Basic;
import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        //this is variable
        int a;
        float b;
        char c;
        double d;
        String name;
        final int x=6;  //This is constant
        System.out.println(x);
        Scanner input = new Scanner(System.in);
        System.out.println("Inter a integer number: ");
        a = input.nextInt();
        System.out.println("Inter a float Number: ");
        b = input.nextFloat();
        System.out.println("Inter a charecter: ");
        c = input.next().charAt(0);
        System.out.println("Inter a string: ");
        name = input.next();
        System.out.println("Integer "+a+" Float "+b+" Char "+c+" Name "+name);
        //type conversion
        int y = 5;
        System.out.println((float)y);
    }
}
