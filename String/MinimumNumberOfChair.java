package String;

public class MinimumNumberOfChair {
    public static void main(String[] args) {
        String s = "ELELEEL";
        int chair = 0;
        int max = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            builder.append(c);
            if(builder.charAt(i)=='E'){
                chair++;
            }
            else{
                chair--;
            }
            if(max<chair){
                max = chair;
            }
        }
        System.out.println(max);
    }
}
