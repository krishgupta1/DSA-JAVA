package Array;

import java.util.Arrays;

public class greatestCommonDivision {
    public static void main(String[] args) {
        int[] nums = {3,3};
        Arrays.sort(nums);
        int size = nums.length;
        int small = nums[0];
        int greater = nums[size-1];

        if(greater % small == 0 ){
            System.out.println(small);
        }
        else{
            System.out.println("1");
        }
    }
}
