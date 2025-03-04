package String;

public class RemoveAllOccurenceOfASubstring {
    public static void main(String[] args) {
        String s = "daabcbaabcbc", part = "abc";

        while(s.contains(part))
            s= s.replaceAll(part, "");
        System.out.println(s);
    }
}
