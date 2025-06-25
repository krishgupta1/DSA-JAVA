package Array;

import java.util.Arrays;

public class HowManyNumberSmaller {
    public static void main(String[] args) {
        int[]  nums = {7,7,7,7};
        int rest[] = new int[nums.length];
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            rest[i] = count;
            count = 0;
        }
        System.out.println(Arrays.toString(rest));
    }
}
