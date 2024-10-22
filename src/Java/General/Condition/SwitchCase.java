package Java.General.Condition;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = input.nextInt();
        switch (x){
            case 0:
                System.out.println("X is zero");
                break;
            case 1:
                System.out.println("X is one");
                break;
            case 2:
                System.out.println("X is two");
                break;

            case 3:
                System.out.println("X is three");
                break;
            case 4:
                System.out.println("X is four");
                break;
            default:
                System.out.println("X is unidentified.");
        }
    }
}