package Array;

import java.util.*;

public class _4Sum {
    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        HashSet<List<Integer>> set = new HashSet<>();

        for (int a = 0; a < nums.length-3; a++) {
            for (int b = a + a; b < nums.length-2; b++) {
                int c = b + 1;
                int d = nums.length - 1;
                long sum = (long) nums[a] + (long) nums[b] + (long) nums[c] + (long) nums[d];
                if (sum == target) {
                    set.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                    c++;
                    d--;
                }
                if (sum < target) {
                    c++;
                } else if (sum > target) {
                    d--;
                }
            }
        }
        System.out.println(set);
    }
}
