package Array;

import java.util.Arrays;

public class NeitherMaxOrMin {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4};
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                max = nums[i];
            }
            else{
                min = nums[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(Arrays.toString(nums));
    }
}
