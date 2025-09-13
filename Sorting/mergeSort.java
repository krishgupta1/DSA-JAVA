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
        if( start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortHelper(arr, start, mid);
        mergeSortHelper(arr, mid + 1, end);
        // Merge Code
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end){
        int [] temp = new int[end - start + 1];
        int p1 = start,
            p2 = mid + 1,
            p3 = 0;
            
        while(p1 <= mid && p2 <= end){
            if(arr[p1] < arr[p2]){
                temp[p3] = arr[p1];
                p1 = p1 + 1;
            }
            else{
                temp[p3] = arr[p2];
                p2 = p2 + 1;
            }
            p3 = p3 + 1;
        }
        while(p1 <= mid){
            temp[p3] = arr[p1];
            p1 = p1 + 1;
            p3 = p3 + 1;
        }
        while(p2 <= end){
            temp[p3] = arr[p2];
            p2 = p2 + 1;
            p3 = p3 + 1;
        }

        int i = 0;
        p1 = start;
        while(i < temp.length){
            arr[p1] = temp[i];
            i = i + 1;
            p1 = p1 + 1;
        }

    }
}
