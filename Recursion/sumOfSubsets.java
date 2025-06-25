package Recursion;
public class sumOfSubsets {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        getSSQV3(arr,0,0);
    }
    static void getSSQV3(int[] arr, int idx, int sum) {
        if (idx >= arr.length) {
            System.out.println(sum);
            return;
        }
        getSSQV3(arr, idx + 1, sum + arr[idx]);
        getSSQV3(arr, idx + 1, sum);
    }
}