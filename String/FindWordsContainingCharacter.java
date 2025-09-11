package String;
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        String x = "e";
        List<Integer> newList = new ArrayList<>();
        String newStr = String.valueOf(x);
        for(int i = 0 ; i<words.length; i++){
            if(words[i].contains(newStr)){
                newList.add(i);
            }
        }
        System.out.println(newList);
    }
}
