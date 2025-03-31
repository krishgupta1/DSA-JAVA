package Array;

import java.util.Arrays;

public class MaximumProductDifference {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        Arrays.sort(nums);
        int first = nums[0] * nums[1];
        int last = nums[nums.length-1] * nums[nums.length-2];
        int sum = last - first;
        System.out.println(sum);
        
    }
}
