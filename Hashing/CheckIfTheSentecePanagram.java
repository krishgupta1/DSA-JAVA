package Hashing;

import java.util.HashMap;

public class CheckIfTheSentecePanagram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String newSentence = sentence.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<newSentence.length(); i++){
            char c = newSentence.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        if(map.size() == 26){
            System.out.println("The sentence is a panagram");
        }
        else{
            System.out.println("The sentence is not a panagram");
        }
    }
}