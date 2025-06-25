package String;

public class ScoreOfaString {
    public static void main(String[] args) {
        String s = "hello";
        int[] arr = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            int ascii = c;
            arr[i] = ascii;
        }

        int sum = 0;

        for(int i = 0; i<arr.length-1; i++){
            int a = arr[i];
            int b = arr[i+1];
            int sub = Math.abs(a-b);
            sum += sub;
        }
        System.out.println(sum);


    }
}
