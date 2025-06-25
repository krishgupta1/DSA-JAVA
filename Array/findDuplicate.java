package Array;

import java.util.Arrays;

public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                result = nums[i];
            }
        }
        System.out.println(result);
    }
}
