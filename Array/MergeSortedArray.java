package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        int res[] = new int[m + n];
        int i = 0, j = 0, idx = 0;
        while (i < m && j < n) {
            if (nums1[i]< nums2[j])
                res[idx++] = nums1[i++];
            else
                res[idx++] = nums2[j++];
        }
        while (i < m) {
            res[idx++] = nums1[i++];
        }
        while (j < n) {
            res[idx++] = nums2[j++];
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = res[k];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
