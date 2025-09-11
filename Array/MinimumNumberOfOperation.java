package Array;
import java.util.*;

public class MinimumNumberOfOperation {
    public static void main(String[] args) {
        String boxes = "001011";
        int []res = new int[boxes.length()];
        for(int i = 0; i<res.length; i++){
            int value = 0;
            for(int j = 0; j<res.length; j++){
                if(boxes.charAt(j) == '1'){
                    value += Math.abs(i - j);
                }
            }
            res[i] = value;
        }
        System.out.println(Arrays.toString(res));
    }
}
