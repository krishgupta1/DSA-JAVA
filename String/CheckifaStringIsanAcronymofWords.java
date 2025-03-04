package String;

import java.util.ArrayList;
import java.util.List;

public class CheckifaStringIsanAcronymofWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s = "abc";
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<words.size(); i++){
            String str = words.get(i);
            char c = str.charAt(0);
            builder.append(c);
        }
        if(builder.toString().equals(s)){
            System.out.println("True");
        }
    }
}
