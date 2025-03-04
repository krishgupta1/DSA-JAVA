package Array;

public class NumberofStringsThatAppearasSubstringsinWord {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int counter = 0;
        for(String pattern : patterns){
            if(word.contains(pattern)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
