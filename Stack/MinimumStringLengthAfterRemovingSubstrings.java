package Stack;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
             if (!stack.isEmpty()) {
                char top = stack.peek();
                if ((top == 'A' && c == 'B') || (top == 'C' && c == 'D')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        System.out.println(stack);
    }
}
