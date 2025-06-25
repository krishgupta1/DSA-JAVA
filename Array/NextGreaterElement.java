package Array;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        int result[] = new int[nums.length];
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i+1] > nums[i] ){
                result[i] = nums[i+1];
            }
            else{
                result[i] = -1;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
