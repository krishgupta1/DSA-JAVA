package Stack;

import java.util.ArrayList;

public class implementation {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        
        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //Push
        public static void push(int data){
            list.add(data);
        }

        //Pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        
        if(s.isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
        
    }
}
