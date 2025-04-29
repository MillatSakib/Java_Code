/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.DP;
import java.util.Scanner;

public class LISUsingTabulation {
 static int lcs(String s1, String s2){
 int m=s1.length();
 int n=s2.length();
 int[][] dp=new int[m+1][n+1];
 for(int i=0;i<m;i++){
 dp[i][0]=0;
 }
 for(int i=0;i<n;i++){
 dp[0][i]=0;
 }
 
 for(int i=1;i<=m;i++){
     for(int j=1;j<=n;j++){
         if(s1.charAt(i-1)==s2.charAt(j-1)){
         dp[i][j]=1+dp[i-1][j-1];
         }else{
         dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
         }
     }
 } 
 lcsStringPrint(s1,s2, dp,m, n);
 return dp[m][n];
 }
 
private static void lcsStringPrint(String s1, String s2, int[][] dp,int m, int n){
  int i = m, j = n;
        StringBuilder lcsStr = new StringBuilder();

        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcsStr.append(s1.charAt(i - 1));        
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        System.out.println("Sun String="+lcsStr.reverse().toString());
 }
 public static void main(String[] Args){
     Scanner input = new Scanner(System.in); 
     String s1,s2;
     System.out.print("X=");
     s1=input.nextLine();
     System.out.print("Y=");
     s2=input.nextLine();
 int arr=lcs(s1,s2);
     System.out.println("Maximum similarity= "+arr);
 }
}

