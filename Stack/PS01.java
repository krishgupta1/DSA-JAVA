package Stack;

import java.util.Stack;

public class PS01 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> result = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while(!s.isEmpty()){
            result.push(s.peek());
            s.pop();
        }
        //Revese Stack
        while (!result.isEmpty()) {
            System.out.println(result.peek());
            result.pop();  
        }
    }
    
}