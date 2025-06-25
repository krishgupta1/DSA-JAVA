package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        ArrayList<Integer> list = new ArrayList<>();
    
        for(int i = 0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] res = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            res[i] = list.get(i);
        }
        System.out.println(Arrays.toString(res));
    }

}
