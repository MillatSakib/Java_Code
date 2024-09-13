import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // if-else if-else condition to check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
