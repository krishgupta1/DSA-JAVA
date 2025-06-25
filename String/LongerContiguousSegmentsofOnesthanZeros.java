package String;

public class LongerContiguousSegmentsofOnesthanZeros {
    public static void main(String[] args) {
        String s = "011000111";
        int one = 0;
        int zero = 0;
        int maxOne = 0;
        int maxZero = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(s.charAt(i) == '1'){
                one++;
                zero = 0;
            }
            else{
                zero++;
                one = 0;
            }

            maxOne = Math.max(maxOne, one);
            maxZero = Math.max(maxZero, zero);
        }
        System.out.println(maxOne > maxZero);
    }
}
