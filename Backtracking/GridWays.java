package Backtracking;

public class GridWays {
    public static void main(String[] args) {
        int n = 5, m = 3;
        System.out.println(gridWays(0, 0, m, n));
    }

    private static int gridWays(int i, int j, int m, int n) {
        if(i==n-1 && j==m-1){//cond for last cell
            return 1;
        }
        else if(i == n || j == m){// boundary cross condition
            return 0;
        }

        int w1 = gridWays(i+1, j, m, n);
        int w2 = gridWays(i, j+1, m, n);
        return w1 + w2;
    }
}
