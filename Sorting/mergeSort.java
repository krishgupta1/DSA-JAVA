package Sorting;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = new int[] {7, 2, 6, 4, 9, 8, 1, 5};
        mergeSortHelper(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.println(val);
        }
    }
    public static void mergeSortHelper(int arr[], int start, int end){

    }
}
