package Array;
import java.util.Arrays;
import java.util.HashSet;

public class MakeArrayZerobySubtractingEqualAmounts{
    public static void main(String[] args) {
        // int[] nums = {0};
        // Set<Integer> distinctValues = new HashSet<>();
        
        // for (int num : nums) {
        //     if (num != 0) {
        //         distinctValues.add(num);
        //     }
        // }
        
        // System.out.println(distinctValues.size());
        int[] nums = {4,1,4,0,3,5};
        Float Avg = 0f;
        HashSet<Float> hashSet = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i <nums.length/2; i++){
            int first = nums[i];
            int last = nums[nums.length - 1 -i];
            Avg = (first + last) / 2.0f;
            hashSet.add(Avg);
        }
        System.out.println(hashSet.size());

    }
}