package Array;
import java.util.*;

public class Distribute {
    public static void main(String[] args) {
        int[] nums = {2,1,3};
        List<Integer> ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(i == 0 ){
                l1.add(nums[i]);
            }
            else if(i == 1){
                l2.add(nums[i]);
            }
            else{
                if(l1.get(l1.size() - 1) > l2.get(l2.size()-1)){
                    l1.add(nums[i]);
                }
                else{
                    l2.add(nums[i]);
                }
            }
        }

        ans.addAll(l1);
        ans.addAll(l2);
        int res[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            res[i] = ans.get(i);
        }


    }
}
