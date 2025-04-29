/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.DP;

/**
 *
 * @author Sakib
 */
public class MemorizationLCS {
    static int lcs(String s1, String s2, int m, int n){
        int[][] memo = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
        for(int j=0;j<n+1; j++){
            memo[i][j]=-1;
        }
        }
        if(memo[m][n] != -1){
            return memo[m][n];
        }
        if(m==0 || n==0){
        memo[m][n]=0;
        }
        else{
        if(s1.charAt(m-1)==s2.charAt(n-1)){
        memo[m][n] = 1+lcs(s1,s2,m-1,n-1);
        }else{
        memo[m][n]=Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
        }
        }
        
        return memo[m][n];
    }
    
    public static void main(String[] Args){
        System.out.println(lcs("ABDd","CBDd",4,4));
    
    }
}
