package Recursion;
import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
        tri(4, 0);
        tri2(5, 0);
        int arr[]  = {1,3,2,4,6,5};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void tri(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            tri(r, c+1);
        }
        else{
            System.out.println();
            tri(r-1, 0);
        }
    }

    static void tri2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            tri2(r, c+1);
            System.out.print("*");
        }
        else{
            tri2 (r-1, 0);
            System.out.println();
        }
    }
    static void bubble(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] =  arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        }
        else{
            bubble(arr, r-1, 0);
        }
    }
}