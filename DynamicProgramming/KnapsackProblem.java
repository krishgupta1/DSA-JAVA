package DynamicProgramming;

public class KnapsackProblem {
    public static void main(String[] args) {
        int W = 4;
        int[] val = { 1, 2, 3 };
        int[] wt = { 4, 5, 1 };

        System.out.println(knapsack(W, val, wt));
    }

    public static int knapsack(int W, int[] val, int[] wt) {
        int n = val.length;
        int[][] dp = new int[n][W + 1];

        // Initialize the first row
        for (int w = 0; w <= W; w++) {
            if (wt[0] <= w) {
                dp[0][w] = val[0];
            } else {
                dp[0][w] = 0;
            }
        }

        // Fill the rest of the table
        for (int i = 1; i < n; i++) {
            for (int w = 0; w <= W; w++) {
                int pick = 0;
                if (wt[i] <= w) {
                    pick = val[i] + dp[i - 1][w - wt[i]];
                }
                int noPick = dp[i - 1][w];
                dp[i][w] = Math.max(pick, noPick);
            }
        }

        return dp[n - 1][W];
    }

    public static int recur(int w, int[] val, int[] wt, int i) {
        if (w == 0) {
            return 0;
        }
        if (i == 0) {
            if (wt[i] <= w) {
                return val[i];
            } else {
                return 0;
            }
        }

        int pick = 0;
        if (wt[i] <= w) {
            pick = val[i] + recur(w - wt[i], val, wt, i - 1);
        }

        int noPick = recur(w, val, wt, i - 1);

        return Math.max(noPick, pick);
    }

    public static int Memoization(int w, int[] val, int[] wt, int i, int[][] dp) {
        if (w == 0) {
            dp[i][w] = 0;
            return 0;
        }
        if (i == 0) {
            if (wt[i] <= w) {
                dp[i][w] = val[i];
                return val[i];
            } else {
                dp[i][w] = 0;
                return 0;
            }
        }

        if (dp[i][w] != -1) {
            return dp[i][w];
        }

        int pick = 0;
        if (wt[i] <= w) {
            pick = val[i] + Memoization(w - wt[i], val, wt, i - 1, dp);
        }

        int noPick = Memoization(0 + w, val, wt, i - 1, dp);

        dp[i][w] = Math.max(noPick, pick);
        return dp[i][w];
    }
}