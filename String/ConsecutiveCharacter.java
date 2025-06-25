package String;

public class ConsecutiveCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        int max = 1;
        int current = 1;
        for(int i = 1; i <s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                current++;
            }
            else{
                current=1;
            }
            max = Math.max(max, current);
        }
        System.out.println(max);
    }
}
