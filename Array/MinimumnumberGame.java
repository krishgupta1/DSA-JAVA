package Array;

import java.util.Arrays;

public class MinimumnumberGame {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        int arr[] = new int[nums.length];
        Arrays.sort(nums);
        int i = 0,  j = 1;
        int alice = 0;
        int bob = 0;
        while(i<nums.length && j <nums.length){
            alice = nums[i];
            bob = nums[j];
            arr[i] = bob;
            arr[j] = alice;
            i+=2;
            j+=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
