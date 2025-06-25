package Hashing;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        String s = "abcabcbb";
        char c[] = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i<c.length; i++){
            set.add(c[i]);
        }
        System.out.println(set.size());
    }
}