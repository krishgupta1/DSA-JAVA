package Array;
import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        int nums[] = {1,0,1,2};
        Arrays.sort(nums);
        int count = 1;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
        }
        System.out.println(Math.max(max, count));
    }
}