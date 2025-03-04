package String;

public class goalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                builder.append("G");
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    builder.append('o');
                }
                else{
                    builder.append("al");
                    i += 3;
                }
            }
        }
        System.out.println(builder);
    }
}
