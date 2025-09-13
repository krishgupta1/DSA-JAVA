package Sorting;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 0, 3, 8, 4 };
        quickSortHelper(arr, 0, arr.length - 1);
        for(int val : arr){
            System.out.println(val);
        }
    }

    private static void quickSortHelper(int[] arr, int start, int end) {
        if(start >=  end){
            return;
        }
        int pivot = partition(arr, start, end);
        quickSortHelper(arr, start, pivot - 1);
        quickSortHelper(arr, pivot + 1, end);
    }
    private static int partition(int []arr, int start, int end){
        int pivotEle = arr[end];
        int i = start;
        for(int j = start; j <= end; j++){
            if(arr[j] < pivotEle){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i = i + 1;
            }
        }
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}