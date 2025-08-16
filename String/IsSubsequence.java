package String;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "acb", t = "ahbgdc";
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if(s.charAt(i) == s.charAt(j)) i++;
            j++;
        }
        if(i == s.length()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
