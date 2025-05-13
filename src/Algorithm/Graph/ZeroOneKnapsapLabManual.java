
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

/**
 *
 * @author Sakib
 */
import java.util.Scanner;

public class ZeroOneKnapsapLabManual {

    // Utility function to return max of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Function to solve 0/1 Knapsack using Dynamic Programming
    static int knapSack(int W, int[] wt, int[] val, int n) {
        int[][] dp = new int[n + 1][W + 1];

        // Build table dp[][] in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (wt[i - 1] <= w)
                    dp[i][w] = max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        return dp[n][W]; // Maximum profit
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        System.out.print("Enter size of the knapsack: ");
        int W = sc.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];

        System.out.println("Enter values of the items:");
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }

        System.out.println("Enter weights of the items:");
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }

        int result = knapSack(W, wt, val, n);
        System.out.println("Maximum total profit = " + result);
        sc.close();
    }
}

/*

Sample Input:
Enter number of items: 3
Enter size of the knapsack: 50
Enter values of the items:
60 100 120
Enter weights of the items:
10 20 30

Sample Output:
Maximum total profit = 220

*/