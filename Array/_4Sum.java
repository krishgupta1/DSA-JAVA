package Array;

import java.util.*;

public class _4Sum {
    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> res = new ArrayList<>();

        for (int a = 0; a < nums.length; a++) {
            for (int b = a+1; b < nums.length; b++) {
                for (int c = b+1; c < nums.length; c++) {
                    for (int d = c+1; d < nums.length; d++) {
                        if(nums[a] + nums[b] + nums[c] + nums[d] == target){
                            List<Integer> addVal = new ArrayList<>();
                            addVal.add(nums[a]);
                            addVal.add(nums[b]);
                            addVal.add(nums[c]);
                            addVal.add(nums[d]);
                            Collections.sort(addVal);
                            if(!res.contains(addVal))
                                res.add(addVal);
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
