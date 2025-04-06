package Recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5};
        int target = 3;
        // System.out.println(linear(arr, target, 0));
        // System.out.println(printIdx(arr, target, 0));
        // AllIdx(arr, target, 0);
        System.out.println(retList(arr, target, 0).toString());
    }
    static boolean linear(int arr[], int target, int idx){
        if(idx>=arr.length){
            return  false;
        }
        if(arr[idx] == target){
            return true;
        }
        return linear(arr, target, idx+1);
    }

    static int printIdx(int arr[], int target, int idx){
        if(idx>=arr.length){
            return  -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return printIdx(arr, target, idx+1);
    }

    static void AllIdx(int arr[], int target, int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx] == target){
           System.out.println(idx);
        }
        AllIdx(arr, target, idx+1);
    }

    static ArrayList<Integer> retList(int arr[], int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx>=arr.length){
            return list;
        }
        if(arr[idx] == target){
          list.add(idx);
        }
        ArrayList<Integer> smallAn = retList(arr, target, idx+1);
        list.addAll(smallAn);
        return list;
    }
}
