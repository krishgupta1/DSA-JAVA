package String;
import java.util.Arrays;

public class DuplicateCountInString {
    public static void main(String[] args) {
        String str = "aabbcdde";
        int [] arr = new int[26];
        for(int i = 0; i<str.length(); i++){
            int charValues = str.charAt(i);
            int arrayIndex = charValues - 97;
            arr[arrayIndex]++;
            System.out.println(str.charAt(i) + "---->" + "char value = " + charValues + "ArrayIndex = " + arrayIndex);
        }
//        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 1){
                char c = (char) (97+i);
                System.out.println("Duplicate value : " + c);
            }
        }
    }
}
