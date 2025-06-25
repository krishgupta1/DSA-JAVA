package Array;
import java.util.*;
public class FindeTargetIndicesAfterSorting {
    public static void main(String[] args) {
        int nums[] = {1,2,5,2,3};
        int target = 2;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
