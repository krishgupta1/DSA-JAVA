package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumAverageOfSmallestAndLargestElement {
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> avg = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            list.add(nums[i]);
        }

        for(int i = 0; i<nums.length/2; i++){
            int min = list.remove(0);
            int max = list.remove(list.size()-1);
            avg.add((min+max) / 2.0);
        }
        double result[] = new double[avg.size()];
        for(int i = 0; i<avg.size(); i++){
            result[i] = avg.get(i);
        }
        Arrays.sort(result);
    }
}
