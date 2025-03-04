package Array;

import java.util.Arrays;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        boolean[] visited = new boolean[nums2.length];
        for(int i = 0; i<nums1.length; i++){
            boolean alreadyAdded = false;
            for(int j = 0; j < index; j++){
                if(res[j] == nums1[i]){
                    alreadyAdded = true;
                    break;
                }
            }
            if(!alreadyAdded){
                for(int j = 0; j<nums2.length; j++){
                    if(nums2[j] == nums1[i] && !visited[j]){
                        res[index] = nums1[i];
                        visited[j] = true;
                        ++index;
                        break;
                    }
                }
            }
        }
        res = Arrays.copyOf(res, index);
        System.out.println(Arrays.toString(res));
    }
}
