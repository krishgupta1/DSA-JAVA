package String;

public class ReverseWordInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] str = s.trim().split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = str.length-1; i >= 0; i--){
            builder.append(str[i] + " ");
        }
        System.out.println(builder);
    }
}
