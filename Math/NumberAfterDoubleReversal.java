package Math;

public class NumberAfterDoubleReversal {
    public static void main(String[] args) {
        int num = 526;
        String s = String.valueOf(num);
        
        StringBuilder str = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            str.append(s.charAt(i));
        }
        str.reverse();
        String s2 = str.toString();
        int val1 = Integer.parseInt(s2);
        String s3 = String.valueOf(val1);
        StringBuilder str2 = new StringBuilder();

        for(int i = 0; i<s3.length(); i++){
            str2.append(s3.charAt(i));
        }

        str2.reverse();
        String s4 = str2.toString();
        int ans = Integer.parseInt(s4);

        
        if(ans == num){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
