package Array;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide1299 {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            if(i == arr.length-1){
                result[i] = -1;
                break;
            }
            for(int j = i+1; j<arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                }
                result[i] = max;
                
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
