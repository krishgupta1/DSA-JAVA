import java.util.Arrays;

public class Maximum69Number {
    public static void main(String[] args) {
        int num = 9999;
        char[] digit = String.valueOf(num).toCharArray();
        for(int i = 0; i < digit.length; i++){
            if(digit[i] == '6'){
                digit[i] = '9';
                break;
            }
        }
        System.out.println(Arrays.toString(digit));
    }
}
