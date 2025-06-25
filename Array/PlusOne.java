package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[]  digits = {9};
        digits[digits.length-1] += 1;

        if (digits[digits.length - 1] == 10) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            newDigits[1] = 0;
            System.out.println(Arrays.toString(newDigits));
        } else {
            System.out.println(Arrays.toString(digits));
        }
    }
}
