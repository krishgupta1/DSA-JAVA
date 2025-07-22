package Array;

import java.util.Arrays;

public class ReversePairs {
    public static void main(String[] args) {
        int nums[] = {2,4,3,5,1};
        int count = 0;
        Arrays.sort(nums);
        int start = nums.length - 1;
        int end = 0;
        while (start > end) {
            if ((long)nums[start] > 2L * nums[end]) {
                count += (start - end);
                end++;
            } else {
                start--;
            }
        }
        System.out.println(count);
    }
}
