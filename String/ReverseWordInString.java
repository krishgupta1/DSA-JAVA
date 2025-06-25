package String;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String string[] = s.split(" ");
        for(int i = 0; i<string.length; i++){
            StringBuilder builder = new StringBuilder(string[i]);
            string[i] = builder.reverse().toString();
        }
        String str = String.join(" ",string);
        System.out.println(str);
    }
}
