/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.General.Array;
import java.util.*;
/**
 *
 * @author Sakib
 */
public class MultidimentionalArray {
    public static void main(String[] args){
    int[][] myArray = new int[12][8];
    int numRows = myArray.length;
    int numCols = myArray[0].length;
    
    for(int row = 0; row<numRows; ++row){
    for(int col = 0; col<numCols; ++col){
        myArray[row][col] = row*numCols+col+1;
    }
    }
    for(int row = 0; row < numRows; ++row){
        for(int col = 0; col < numCols; ++col){
            System.out.print("    "+myArray[row][col]);
        }
        System.out.println();
    }
    }
    
}
