package Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArray2 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res.add(nums1[i]);
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int[] resA = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resA[i] = res.get(i);
        }

        System.out.println(Arrays.toString(resA));

    }
}
