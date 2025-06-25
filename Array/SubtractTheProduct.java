package Array;

public class SubtractTheProduct {
    public static void main(String[] args) {
        int n = 234;
        String s = String.valueOf(n);
        int sum =0;
        int prod = 1;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            int num = Character.getNumericValue(c);
            sum += num;
            prod = prod * num;
        }
        System.out.println(prod - sum);
    }
    
}
