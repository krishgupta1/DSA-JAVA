package Recursion;
import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,5,5,5,5};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(arr, 4,0));
        System.out.println(findAll(arr, 2,0, list));

        System.out.println(findAll2(arr, 5, 0));
    }

    static int search(int arr[], int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return search(arr, target, index+1);
        }
    }

    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAll(arr, target, index+1, list);
    }
    static ArrayList<Integer> findAll2(int[] arr, int target, int index){
        ArrayList<Integer> list2 = new ArrayList<>();
        if(index == arr.length){
            return list2;
        }

        if(arr[index] == target){
            list2 .add(index);
        }
        ArrayList<Integer> answerFromBelowCalls = findAll2(arr, target, index+1);
        list2.addAll (answerFromBelowCalls);
        return list2;
    }
}