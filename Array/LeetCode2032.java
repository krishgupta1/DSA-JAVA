package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode2032 {
    public static void main(String[] args) {
        int[] nums1 = {3,1};
        int[] nums2 = {2,3};
        int[] nums3 = {1,2};
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        for(int i = 0; i<nums2.length; i++){
            for(int j = 0; j<nums3.length; j++){
                if(nums2[i] == nums3[j]){
                    set.add(nums2[i]);

                }
            }
        }
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums3.length; j++){
                if(nums1[i] == nums3[j]){
                    set.add(nums1[i]);
                }
            }
        }
        for(Integer i : set){
            list.add(i);
        }
        System.out.println(list);
    }
}
