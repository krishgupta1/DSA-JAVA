package DP;

public class fibonacciNumber{
    static int dp[];
    public static void main(String[] args) {
        int n = 6;
        dp = new int[n + 1];
        System.out.println(fiboHelper(n, dp));
    }
    // Recursion
    // public int fiboHelper(int n){
    //     if(n <= 1){
    //         return n;
    //     }

    //     return fiboHelper(n - 1) + fiboHelper(n - 2);
    // }

    // Memoization
    // public static int fiboHelper(int n){
    //     if(n <= 1){
    //         return n;
    //     }

    //     if(dp[n] != 0){
    //         return dp[n];
    //     }

    //     int ans = fiboHelper(n - 1) + fiboHelper(n - 2);
    //     dp[n] = ans;
    //     return ans;
    // }

    // Tabulation
    public static int fiboHelper(int n, int dp[]){
        if(n <= 1){
            return n;
        }

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i = i + 1){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
