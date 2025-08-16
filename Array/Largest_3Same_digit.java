package Array;

public class Largest_3Same_digit {
    public static void main(String[] args) {
        String num = "6777133339";
        StringBuilder builder = new StringBuilder();
        for(int i = num.length(); i > 0; i--){
            // char c1 = num.charAt(i);
            // char c2 = num.charAt(i+1);
            // char c3 = num.charAt(i+2);
            // if(c1 == c2){
            //     if(c2 == c3){
            //         builder.append(c1);
            //         builder.append(c2);
            //         builder.append(c3);
            //         break;
            //     }
            // }
            String str = String.valueOf(i).repeat(3);
            if(num.contains(str)){
                System.out.println(str);
            }
        }
        // System.out.println(builder.toString());
    }
}
