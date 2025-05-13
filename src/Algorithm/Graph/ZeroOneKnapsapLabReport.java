/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

/**
 *
 * @author Sakib
 */

/*
Prblem Domain
Implement Longest increasing sub-sequence problem using DP technique.
• Hint: {9, 2, 5, 3, 7, 11, 8, 10, 13, 6} is a sequence. A possible longest sub-sequence in increasing
order can be {2, 5, 7, 8, 10, 13}

*/

import java.util.Scanner;

public class ZeroOneKnapsapLabReport {

    // Function to find LIS length using Dynamic Programming
    public static int findLIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];

        // Every element is at least an LIS of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Build the dp[] array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find maximum in dp[]
        int maxLen = 0;
        for (int len : dp) {
            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the sequence:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int lisLength = findLIS(arr);
        System.out.println("Length of Longest Increasing Subsequence: " + lisLength);

        scanner.close();
    }
}

/*Sample Input:

Enter number of elements:
10
Enter the elements of the sequence:
9 2 5 3 7 11 8 10 13 6

Sample Output:
Length of Longest Increasing Subsequence: 6
*/