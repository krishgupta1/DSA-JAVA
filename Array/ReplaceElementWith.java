package Array;

import java.util.Arrays;

public class ReplaceElementWith {
    public static void main(String[] args) {
        int []arr = {17,18,5,4,6,1};
        int n = arr.length;
        int res[] = new int[n];
        // for(int i = 0; i < n; i++){
        //     int max = Integer.MIN_VALUE;
        //     if(arr[i] == 1){
        //         res[i] = -1;
        //     }
        //     for(int j = i + 1; j < n; j++){
        //         if(max < arr[j]){
        //             max = arr[j];
        //         }
        //         res[i] = max; 
        //     }
        // }
        int max = -1;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] > max){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
            else{
                arr[i] = max;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
