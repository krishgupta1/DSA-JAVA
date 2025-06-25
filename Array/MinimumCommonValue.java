package Array;

import java.util.HashSet;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,6}, nums2[] = {2,3,4,5};
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num));
        }
    }
}
