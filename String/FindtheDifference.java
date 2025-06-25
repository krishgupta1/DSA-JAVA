package String;

public class FindtheDifference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        int result = 0;
        for(char c : s.toCharArray()){
            result ^= c;
        }
        System.out.println(result);
        for(char c : t.toCharArray()){
            result ^= c;
        }
        System.out.println((char)result);
    }
}
