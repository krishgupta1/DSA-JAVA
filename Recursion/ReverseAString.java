package Recursion;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "qwertyuii";
        System.out.println(reverse(s, 0));
    }
    static String reverse(String s, int idx){
        if(idx == s.length()) return "";
        String small = reverse(s, idx+1);
        return small + s.charAt(idx);
    }
}
