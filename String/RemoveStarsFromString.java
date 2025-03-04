package String;

public class RemoveStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        StringBuilder builder = new StringBuilder();
        String[] str = new String[s.length()];
        int top = -1;
        for(int i = 0; i <s.length(); i++){
            char c = s.charAt(i);
            if(c == '*'){
                if(i >= 0)
                    str[top] = "";
                    top--;
            }
            else{
                top++;
                str[top] = String.valueOf(c);
            }
        }
        for(int i = 0; i <=top; i++){
            builder.append(str[i]);
        }
        System.out.println(builder.toString());
    }
}
