/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.DP;

/**
 *
 * @author Sakib
 */
public class NaiveLCS {
        static int lcs(String s1, String s2, int m, int n){
    
    
    if(m==0 || n==0){
    return 0;
    }
    if(s1.charAt(n-1)==s2.charAt(m-1)){
    return 1+lcs(s1, s2, m-1, n-1);
    
    }
    else{
    return Math.max(lcs(s1, s2, m-1, n), lcs(s1,s2,m,n-1));
    }
    }
    public static void main(String[] args) {
        System.out.println(lcs("CDA","DBA",3,3));
    }
}
//The graph are given on your Notebook