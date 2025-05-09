/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

import java.util.Scanner;

/**
 *
 * @author Sakib
 */
public class AdajencyMartix {

    public static void main(String[] args) {
        adjList();
    }

    static void adjList() {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[10][10];
        int node = 4, edege = 4;
        int p1, p2;
        for (int i = 0; i < edege; i++) {
            p1 = (int) sc.next().charAt(0) - 'A';
            p2 = (int) sc.next().charAt(0) - 'A';
            mat[p1][p2] = 1;
            mat[p2][p1] = 1;
        }
        for (int i = 0; i < node; i++) {
            for (int j = 0; j < node; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}



/*

Sample Input:
A B
A C
B C
C D

Sample Output:
0 1 1 0 
1 0 1 0 
1 1 0 1 
0 0 1 0

*/
