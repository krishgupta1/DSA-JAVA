package String;

public class CountPrefix {
    public static void main(String[] args) {
        String words[] = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int count = 0;
        for(int i = 0; i<words.length; i++){
            if(s.startsWith(words[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
