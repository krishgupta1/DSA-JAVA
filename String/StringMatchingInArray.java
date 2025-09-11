package String;
import java.util.ArrayList;

public class StringMatchingInArray {
    public static void main(String[] args) {
        String words[] = {"mass","as","hero","superhero"};
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i!=j && words[j].contains(words[i])){
                    list.add(words[i]);
                    break;
                }
            }
        }
        System.out.println(list.toString());
    }
}
