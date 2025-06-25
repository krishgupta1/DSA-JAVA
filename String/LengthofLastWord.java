package String;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] arr = s.split(" ");
        String string = arr[arr.length - 1];
        int count =0;
        for(char c : string.toCharArray()){
            count++;
        }
        System.out.println(count);
    }

}
