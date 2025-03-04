package String;

public class DeleteCharacterToMakeFancyString {
    public static void main(String[] args) {
        String s = "leeetcode";
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for(int i = 0; i<s.length()-1; i++){
            char c = s.charAt(i);
            char c2 = s.charAt(i+1);
            if(c == c2){
                count++;
                if(count < 3){
                    builder.append(c);
                }
            }
            else{
                builder.append(c);
                count = 1;
            }
        }
        builder.append(s.charAt(s.length()-1));
        System.out.println(builder.toString());
    }
}
