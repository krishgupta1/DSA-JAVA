package Array;

import java.util.PriorityQueue;

public class kPairWithSmallestSum {
    public static void main(String[] args) {
       int[] nums1 = {1,7,11}, nums2 = {2,4,6};
       int k = 3;
       PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> {return e1[0] - e2[0];}); 
       for(int i = 0; i < nums1.length; i++){
        for(int j = 0; j<nums2.length; j++){
            int value = nums1[i] + nums2[j];
        }
       }
    }
}
