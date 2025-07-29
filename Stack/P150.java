package Stack;

import java.util.Stack;

public class P150 {
    public static void main(String[] args) {
        String[]tokens = {"4","13","5","/","+"};

        String expStr = "+-/*";

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if(expStr.contains(token)){
                int o2 = stack.pop();
                int o1 = stack.pop();

                int val = 0;
                switch (token) {
                    case "+" :
                        val = o1 + o2;
                        break;
                    case "-" :
                        val = o1 - o2;
                        break;
                    case "*" :
                        val = o1 * o2;
                        break;
                    case "/" :
                        val = o1 / o2;
                        break;
                }
                stack.push(val);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        System.out.println(stack.peek());
    }
}
