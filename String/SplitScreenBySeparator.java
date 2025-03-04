package String;

import java.util.*;

public class SplitScreenBySeparator {
    public static void main(String[] args) {
        String[] words = {"one.two.three", "four.five", "six"};
        char separator = '.';

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String[] splitParts = word.split("\\" + separator);
            for (String part : splitParts) {
                if (!part.isEmpty()) { 
                    result.add(part);
                }
            }
        }

        System.out.println("Final result: " + result);
    }
}
