package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class FindCommonBWTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }

        for(Integer i : set){
            list.add(i);
        }

        ArrayList<Integer> forNum1 = new ArrayList();


        for(int i = 0; i<list.size(); i++){
            for(int j = 0; j<nums1.length; j++){
                if(list.get(i) == nums1[j]){
                    forNum1.add(nums1[j]);
                }
            }
        }

        System.out.println(forNum1);

        
    }
}
