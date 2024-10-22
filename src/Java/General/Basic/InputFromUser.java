/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.General.Basic;

import java.util.Scanner;

/**
 *
 * @author Sakib
 */
public class InputFromUser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Input for String
        System.out.print("Enter a string: ");
        String userInputString = scanner.nextLine();
        
        // Input for int
        System.out.print("Enter an integer: ");
        int userInputInt = scanner.nextInt();
        
        // Input for float
        System.out.print("Enter a float: ");
        float userInputFloat = scanner.nextFloat();
        
        // Input for double
        System.out.print("Enter a double: ");
        double userInputDouble = scanner.nextDouble();
        
        // Display the entered values
        System.out.println("You entered the following:");
        System.out.println("String: " + userInputString);
        System.out.println("Integer: " + userInputInt);
        System.out.println("Float: " + userInputFloat);
        System.out.println("Double: " + userInputDouble);
        
        // Close the scanner
        scanner.close();
    }
}
