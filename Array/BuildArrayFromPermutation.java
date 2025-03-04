package Array;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int  nums[] = {0,2,1,5,3,4};
        int result[] = new int[nums.length];
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            result[index] = nums[nums[i]];
            index++;
        }
        System.out.println(Arrays.toString(result));
    }
}
