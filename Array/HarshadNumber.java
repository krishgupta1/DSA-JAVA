package Array;

public class HarshadNumber {
    public static void main(String[] args) {
        int x = 25;
        int sum = 0;
        String s = String.valueOf(x);
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            int newN = Character.getNumericValue(c);
            sum += newN;
        }
        if (x%sum == 0) {
            System.out.println(sum);
        }
        else{
            System.out.println("-1");
        }
    }
}
