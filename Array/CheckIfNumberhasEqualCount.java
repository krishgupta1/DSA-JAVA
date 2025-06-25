package Array;

import java.util.Arrays;

public class CheckIfNumberhasEqualCount {
    public static void main(String[] args) {
        String num = "1210";
        int value[] = new int[num.length()];
        
        for(int i = 0; i<num.length(); i++){
            value[i] = num.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(value));
        for(int i = 0; i<value.length; i++){
            int count = 0;
            for(int j = 0; j<value.length; j++){
                if(value[j] == i){
                    count++;
                }
            }
            if(count != value[i]){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
