package Stack;

import java.util.*;

public class imp {
    static class myStack {
        List<Integer> list;

        public myStack() {
            list = new ArrayList<>();
        }

        void push(int x) {
            list.add(x);
        }

        void pop() {
            list.remove(list.size() - 1);
        }

        boolean isEmpty() {
            return list.size() == 0;
        }

        void print() {
            int i = list.size() - 1;
            if (list.isEmpty()) {
                System.out.println("Stack is Empty");
            } else {
                while (!list.isEmpty()) {
                    System.out.println(list.remove(i));
                    i--;
                }
            }
        }

        void peek() {
            if (list.isEmpty()) {
                System.out.println("Stack is Empty");
            } else {
                System.out.println(list.get(list.size() - 1));
            }
        }
    };

    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.peek();
        stack.print();
    }
}
