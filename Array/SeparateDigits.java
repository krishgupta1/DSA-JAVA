package Array;

import java.util.*;

public class SeparateDigits {
    public static void main(String[] args) {
        int[] nums = { 13, 25, 83, 77 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String string = String.valueOf(nums[i]);
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                String s = String.valueOf(c);
                int value = Integer.parseInt(s);
                list.add(value);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        System.out.println(Arrays.toString(result));
    }

}
