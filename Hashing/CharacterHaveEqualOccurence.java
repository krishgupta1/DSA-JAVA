package Hashing;

import java.util.HashMap;

public class CharacterHaveEqualOccurence {
    public static void main(String[] args) {
        String s = "abacbc";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        int frequency = map.get(s.charAt(0));
        for(Character character : map.keySet()){
            if(map.get(character) != frequency){
                System.out.println("Not Equal");
            }
            
        }
        
        System.out.println("Equal");
    }
}
