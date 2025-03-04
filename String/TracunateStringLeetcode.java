package String;

import java.util.Arrays;

public class TracunateStringLeetcode {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String[] strArray = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<k; i++){
            if(i<k-1)
                builder.append(strArray[i] + " ");
            else
                builder.append(strArray[i]);
        }
        System.out.println(builder);
    }
}
