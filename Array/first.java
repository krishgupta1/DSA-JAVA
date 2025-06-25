package Array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int res[] = findErrorNums(nums);
        System.out.println(Arrays.toString(res));

    }
    public static int[] findErrorNums(int[] nums) {
        int x = 0;
        int y = 0;
        for(int i = 0; i<=nums.length-1; i++){
            if(i<nums.length && nums[i] != i+1){
                nums[i] = i+1;
                x = i;
                y = i-1;

            }
        }
        for(int i=y; i<x+1; i++){
            System.out.println(nums[i]);
        }
        return nums;
    }

}
