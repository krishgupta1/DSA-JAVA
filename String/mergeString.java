package String;

public class mergeString {
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqr";
        StringBuilder newWord = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i<word1.length() && j<word2.length()){
           newWord.append(word1.charAt(i++));
           newWord.append(word2.charAt(j++));
        }
        while(i<word1.length()){
           newWord.append(word1.charAt(i++));
        }while(j<word1.length()){
           newWord.append(word2.charAt(j++));
        }
        System.out.println(newWord);
    }
}
