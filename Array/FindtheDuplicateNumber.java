package Array;

import java.util.HashSet;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int []nums = {1,3,4,2,2};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i< nums.length; i++){
            if(set.contains(nums[i])){
                System.out.println(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
    }
}
