/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.General.Array;

/**
 *
 * @author Sakib
 */
public class MultidimentionalArrayForEach {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Using for-each loop to iterate over the 2D array
        for (int[] row : array) {  // Looping through each inner array (rows)
            for (int value : row) {  // Looping through each element in the inner array
                System.out.print(value + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
