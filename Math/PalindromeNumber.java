package Math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.toString());
        sb.reverse();
        if(sb.toString().equals(sb.reverse().toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}