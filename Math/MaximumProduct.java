package Math;

import java.util.Arrays;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] nums = {-1000000, -999999, 1000000};
        Arrays.sort(nums);
        int product1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int product2 = nums[0] * nums[1] * nums[nums.length - 1];
        System.out.println(Math.max(product1, product2));
    }
}
