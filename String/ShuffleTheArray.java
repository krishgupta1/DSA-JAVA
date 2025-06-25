package String;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        int ans[] = new int[nums.length];
        int n = 3;
        int a1[] = new int[n];
        int a2[] = new int[n];
        for(int i = 0; i<n; i++){
            a1[i] = nums[i];
        }
        for(int i = n; i<nums.length; i++){
            a2[i-n] = nums[i];
        }
        for(int i = 0; i<n;i++){
            ans[2 * i] = a1[i];
            ans[2 * i + 1] = a2[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
