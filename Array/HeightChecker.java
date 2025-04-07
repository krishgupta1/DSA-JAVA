package Array;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int res = 0;
        for(int i = 0; i<heights.length; i++){
            if(arr[i] != heights[i]){
                res++;
            }
        }
        System.out.println(res);
    }
}
