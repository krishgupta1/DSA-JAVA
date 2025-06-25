package Array;

import java.util.Arrays;

public class Parity {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        int res[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                res[i] = 0;
            }
            else{
                res[i] = 1;
            }
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
