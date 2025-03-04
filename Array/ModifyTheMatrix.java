package Array;

import java.util.Arrays;

public class ModifyTheMatrix {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int n = nums.length;
        int[] res = new int[n*2];
        for(int i = 0; i<n; i++){
            res[i] = nums[i];
            res[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
