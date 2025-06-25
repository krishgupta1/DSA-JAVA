package String;

public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "string";
        StringBuilder result = new StringBuilder();
        for(int i  = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'i'){
                result.reverse();
            }
            else{
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
