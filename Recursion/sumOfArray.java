package Recursion;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(sum(arr, 0));
    }
    static int sum(int arr[], int i){
        if(i == arr.length-1){
            return arr[i];
        }
        int sm = sum(arr, i+1);
        return arr[i] + sm;
    }
}
