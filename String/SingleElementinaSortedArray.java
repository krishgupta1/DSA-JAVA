package String;

import java.util.*;

import Queue.implement;

public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(map.get(nums[i]), 0) + 1);
        }
        Set<Integer> set = map.keySet();
        for(int i : set){
            if(map.get(i) == 1){
                System.out.println(i);
            }
            else{
                System.out.println(false);
            }
        }
        
    }
}
