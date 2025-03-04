package String;

import java.util.*;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aaa", magazine = "aab";
        HashMap<Character ,Integer> map1 = new HashMap<>();
        HashMap<Character ,Integer> map2 = new HashMap<>();

        for(int i = 0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i<magazine.length(); i++){
            char c = magazine.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        Set<Character> set1 = map1.keySet();
        Set<Character> set2 = map2.keySet();

        for(Character character : set1){
            if(map2.getOrDefault(character, 0) < map1.get(character)){
                System.out.println("False");
            }
        }
    }   
}
