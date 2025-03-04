package Hashing;

import java.util.*;

public class UniqueOcurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int freq : map.values()){
            if(!set.add(freq)){
                System.out.println("FALSE");
            }
        }
    }
}
