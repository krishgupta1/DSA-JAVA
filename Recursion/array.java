package Recursion;

public class array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        array(arr, 0);
        System.out.println(max(arr, 0));
    }

    static void array(int arr[], int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        array(arr, i+1);
    }

    static int max(int[] arr, int i){
        if(i == arr.length-1){
            return arr[i];
        }
        int sm = max(arr, i+1);
        return Math.max( sm,arr[i]);
    }
}