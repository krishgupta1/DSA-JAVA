package Math;

public class reverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        String s = String.valueOf(x);
        StringBuilder s1Builder = new StringBuilder();

        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == '-'){
                s1Builder.insert(0, s.charAt(i));
            }
            else{
            s1Builder.append(s.charAt(i));
            }
        }
        String newS = s1Builder.toString();
        int reverse = Integer.parseInt(newS);
        try {
            System.out.println(reverse);
        }
        catch (NumberFormatException e) {
            System.out.println(0);
        }
    }
}
