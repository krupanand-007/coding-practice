package dp;

import java.lang.*;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = 4;//sc.nextInt();
        int[] dp = new int[n+1];

        for(int i=0 ; i<dp.length ; i++){
            dp[i]=-1;
        }

        System.out.print(fibonacci(n, dp));
    }

    public static int fibonacci(int n, int[] dp){
        if(n<=1){
            return n;
        }

        if(dp[n]!=-1){ //if already calculated use the same
            return dp[n];
        }

        dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);
        return dp[n];

    }
}