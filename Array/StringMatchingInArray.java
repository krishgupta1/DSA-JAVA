package Array;
import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        int n = words.length;
        List<String> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i!=j && words[j].contains(words[i])){
                    ans.add(words[i]);
                }
            }
        }
        System.out.println(ans);
    }
}