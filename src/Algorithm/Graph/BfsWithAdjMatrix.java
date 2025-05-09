
package Algorithm.Graph;

import java.util.Scanner;


public class BfsWithAdjMatrix {
    
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
