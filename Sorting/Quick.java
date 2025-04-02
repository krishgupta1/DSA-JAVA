package Sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums, int start, int end ){
        if(start>=end){
            return; 
        }
        int s = start;
        int e = end;
        int m = s + (e - s) / 2;
        int pivot = nums[m];
        while (s<=e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums, start, e);
        sort(nums, s, end); 
    }
} 
