package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindOccurrencesofanElementinanArray {
    public static void main(String[] args) {
        int[] nums = {1,3,1,7}, queries = {1,3,2,4};
        int x = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == x){
                list.add(i);
            }
        }
        int res[] = new int[queries.length];
        for(int j = 0; j<queries.length; j++){
            if(queries[j] <= list.size()){
                res[j] = list.get(queries[j] -1);
            }
            else{
                res[j] = -1;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}