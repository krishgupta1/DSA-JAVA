package Stack;

import java.util.Stack;

public class clearDigit {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // for(int i = 0; i <s.length(); i++){
        //     char c = s.charAt(i);
        //     if(Character.isDigit(c)){
        //         str.deleteCharAt(str.length() - 1);
        //     }
        //     else{
        //         str.append(c);
        //     }
        // }
        // System.out.println(str);

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int alphabet = c;
            if(alphabet >= 48 && alphabet<=57){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        for(Character c : stack){
            str.append(c);
        }
        System.out.println(str.toString());

    }
}
