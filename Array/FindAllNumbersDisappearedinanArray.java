package Array;

import java.util.Arrays;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        Arrays.sort(arr);
        for(int i = 1; i<arr.length; i++){
            if(i != arr[i]){
                System.out.println(i);
            }
        }
    }
}
