package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class majority {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i : map.keySet()){
            if(map.get(i) > (n/2)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
