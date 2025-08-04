package Array;
import java.util.*;

public class singleNumber {
    public static void main(String[] args) {
        int []nums = {2,2,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int res = 0;
        for (Integer key : map.keySet()) {
            if(map.get(key) == 1){
                res = map.get(key);
            }
        }
        System.out.println(res);


    }
}
