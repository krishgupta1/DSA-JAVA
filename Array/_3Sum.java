package Array;

import java.util.*;

public class _3Sum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };

        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right--;
                    break;
                } else if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                }
            }
        }
        System.out.println(set);
    }
}
