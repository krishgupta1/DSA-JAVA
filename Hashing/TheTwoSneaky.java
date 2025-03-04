package Hashing;

import java.util.Arrays;
import java.util.*;

public class TheTwoSneaky {
    public static void main(String[] args) {
        int[] nums = {0,1,1,0};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);

        int [] arr = new int[2];
        Set<Integer> keys = map.keySet();
        for(Integer i : keys){
            if(map.get(i)==2){
                arr[i] =i;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
