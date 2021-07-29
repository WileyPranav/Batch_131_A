/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

/**
 *
 * @author pshastri
 */
public class Fib {
    static long[] dp;
    static long Fibo(int n ){
   
    dp[0]=0;
    dp[1]=1;
    if(n<=1){
        return dp[n];
    }
    if(dp[n]==0 ){
    dp[n]=Fibo(n-1)+Fibo(n-2);
    }
    return dp[n];
    }
    public static void main(String[] args) {
        int n =161;
         dp = new long [n+1];
        System.out.println("The Ans is "+Fibo(n));
    }
}
