package Array;

import java.util.*;

public class CheckifNumbersAreAscendinginaSentence {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String[] string = s.split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        boolean fBoolean = false;

        for(int i = 0; i<string.length; i++){
            String fString = string[i];
            
            if (isNumber(fString)) {
                // Convert the string to an integer and add it to the list
                int number = Integer.parseInt(fString);
                nums.add(number);
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) >= nums.get(i+1)) {
                fBoolean = false;
            }
        }
    }   
    private static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false; // Not a valid number if any character is not a digit
            }
        }
        return true; // All characters are digits, hence it's a valid number
    }
}