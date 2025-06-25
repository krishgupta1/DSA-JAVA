package Array;

import java.util.Arrays;

public class SumInMatrix {
    public static void main(String[] args) {
        int[][] nums = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        int n = nums.length;
        int m = nums[0].length;
        
        for(int i = 0; i<n; i++){
            Arrays.sort(nums[i]);
        }
        int s = 0;
        for(int col = m-1; col >= 0; col-- ){
            int mc = 0;
            for(int r = 0; r<m; r++){
                mc = Math.max(mc, nums[r][col]);
            }
            s+=mc;
        }

        System.out.println(s);
    }
}
