package String;

public class ReversePrefixofWord {
    public static void main(String[] args) {
        String word = "abcdefd"; 
        char ch = 'd';
        StringBuilder builder = new StringBuilder();
        StringBuilder Stringbuilder = new StringBuilder();

        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            builder.append(c);
        }
        
    }
}
