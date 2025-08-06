package Array;

import java.util.*;

public class _4Sum {
    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        HashSet<List<Integer>> set = new HashSet<>();

        for (int a = 0; a < nums.length; a++) {
            for (int b = a+1; b < nums.length; b++) {
                int c = b + 1,
                    d = c + 1;
                while(c < d){
                    long sum = nums[a] + nums[b] + nums[c]+ nums[d];
                    if(sum == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[a]);
                        list.add(nums[b]);
                        list.add(nums[c]);
                        list.add(nums[d]);
                        set.add(list);
                        c++;
                        d--;
                    }
                    else if(sum < 0){
                        c ++;
                    }
                    else if(sum > 0){
                        d --;
                    }
                }
            }
        }
    }
}
