package Hashing;
import java.util.*;

public class PS14 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int first = 0;
        int last = nums.length-1;
        int[] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
                if(nums[i] % 2 == 0){
                    result[first] = nums[i];
                    first++;
                }
                else{
                    result[last] = nums[i];
                    last--;
                }
        }
        System.out.println(Arrays.toString(result));
    }
}