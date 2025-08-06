package Array;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        int n = nums.length;
        int ans[] = new int[n];
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0 ; j < nums.length; j++){
                if(i == j) continue;
                product *= nums[j];
            }
            ans[i] = product;
        }
        System.out.println(Arrays.toString(ans));
    }
}
