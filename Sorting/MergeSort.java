package Sorting;

public class MergeSort {

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei-si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;
        while(index1 <= mid && index2 <= ei){
            if(arr[index1] <= arr[index2]){
                merge[x++] = arr[index1++];
            }
            else{
                merge[x++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            merge[x++] = arr[index1++];
        }
        while(index2 <= ei){
            merge[x++] = arr[index2++];
        }
        for(int i = 0, j = si; i<merge.length; i++, j++){
            arr[j]=merge[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if(si>= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
    }
    
    public static void main(String[] args) {
        int arr[] = {6,7,12,9,21,0,1,5};
        int n = arr.length; 
        divide(arr, 0, n-1);
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}