package Array;

import java.util.Arrays;

public class FindXORElementAppearTwice {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3};
        Arrays.sort(nums);
        int xor = 0;
        for(int i = 0 ;i <nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                // xor = xor ^ nums[i];
                xor = nums[i];
                // i++;
            }
        }
        System.out.println(xor);
    }
}
