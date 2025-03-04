package String;

public class ReverseStringII {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<k; i++){
            char c = s.charAt(i);
            builder.append(c);
        }
        builder.reverse();
        StringBuilder right = new StringBuilder();
        for(int i = k; i<s.length(); i++){
            char c = s.charAt(i);
            right.append(c);
        }
        String result = builder.toString() + right.toString();
        System.out.println(result);
    }
}
