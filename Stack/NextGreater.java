package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int []nums1 = {4,1,2}, nums2 = {1,3,4,2};

        Stack<Integer> stack = new Stack<>();
        int res[] = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            int greater = -1;
            for(int j = 0; j <nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j+1; k<nums2.length; k++){
                        if (nums2[k] > nums2[j]) {
                            greater = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            stack.push(greater);
        }
        int idx = 0;
        for(int i : stack){
            res[idx] = i;
            idx++;
        }
        System.out.println(Arrays.toString(res));
    }
}
