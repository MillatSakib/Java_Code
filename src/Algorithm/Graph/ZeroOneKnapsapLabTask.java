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

/*

Problem are
Given a list of coins i.e 1 taka, 5 taka and 10 taka, can you determine the total number of combinations
*/

public class ZeroOneKnapsapLabTask {

    public static int countWays(int[] coins, int N) {
        int[] dp = new int[N + 1];
        dp[0] = 1; // One way to make amount 0

        for (int coin : coins) {
            for (int i = coin; i <= N; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed coin types: 1, 5, 10 taka
        int[] coins = {1, 5, 10};

        System.out.print("Enter the amount (in taka): ");
        int N = sc.nextInt();

        int ways = countWays(coins, N);
        System.out.println("Total number of combinations to make " + N + " taka: " + ways);

        sc.close();
    }
}

/*

Sample Input:
Enter the amount (in taka): 10
Sample Output
Total number of combinations to make 10 taka: 4
*/