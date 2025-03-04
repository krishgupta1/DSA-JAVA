package String;

public class ThousandSeparator {
    public static void main(String[] args) {
        int n = 1234;
        String str = Integer.toString(n);
        StringBuilder builder = new StringBuilder();
        int len = str.length();
        int count = 0;
        for(int i = len-1; i>=0; i--){
            if(count > 0 && count % 3 ==0){
                builder.append(".");
            }
            builder.append(str.charAt(i));
            count++;
        }
        System.out.println(builder.reverse().toString());
    }
}
