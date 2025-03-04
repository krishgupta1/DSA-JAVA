package Array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j <arr.length-1;j++){
                if(arr[i] == 0){
                    temp = arr[j];
                    arr[j] = 0;
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
