package String;

import java.util.HashSet;

public class MinimizeStringLength {
    public static void main(String[] args) {
        String s = "aaabc";
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            set.add(c);
        }
        System.out.println(set.size());
    }
}
