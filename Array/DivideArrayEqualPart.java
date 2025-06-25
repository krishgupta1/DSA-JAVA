package Array;

import java.util.HashMap;
import java.util.Set;

public class DivideArrayEqualPart {
    public static void main(String[] args) {
        int nums[] = {3,2,3,2,2,2};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
            else{
                hashMap.put(nums[i], 1);
            }
        }

        Set<Integer> set = hashMap.keySet();
        for(Integer integer : set){
            if(hashMap.get(integer) % 2 != 0){
                System.out.println(false);
            }
            else{
                System.out.println(true);
            }
        }
    }
}