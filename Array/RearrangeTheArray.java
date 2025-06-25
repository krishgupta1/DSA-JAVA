package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeTheArray {
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4 };
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 0){
                negative.add(nums[i]);
            }
            else{
                positive.add(nums[i]);
            }
        }
        int result[] = new int[nums.length];
        int pos = 0, neg = 0;
        for(int i = 0; i<result.length-1; i++){
            if(i%2 == 0){
                result[i] = positive.get(pos++);
            }
            else{
                result[i] = negative.get(neg++);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
