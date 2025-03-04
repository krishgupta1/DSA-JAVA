package String;

import java.util.Arrays;

public class AnagramORNot {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();


        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1,c2));
    }
}
