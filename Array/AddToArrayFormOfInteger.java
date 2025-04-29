package Array;

import java.util.*;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int num[] = {2,7,4};
        int k = 181;
        StringBuilder str = new StringBuilder();
        
        for(int i = 0 ; i<num.length; i++){
            str.append(num[i]);
        }
        long newNum = Long.parseLong(str.toString());
        long res = newNum + k;
        
        String newStr = String.valueOf(res);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i<newStr.length(); i++){
            char ch = newStr.charAt(i);
            result.add(Character.getNumericValue(ch));
        }
        System.out.println(result.toString());

    }
}
