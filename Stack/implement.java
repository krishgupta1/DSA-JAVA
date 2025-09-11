package Stack;

import java.util.ArrayList;
import java.util.List;

class MyCustomStack {
    List<Integer> list;

    MyCustomStack() {
        list = new ArrayList<>();
    }

    public void push(int data) {
        list.add(data);
    }

    public void pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Value removed " + list.remove(list.size() - 1));
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public void peek() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println(list.get(list.size() - 1));

    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

}

public class implement {
    public static void main(String[] args) {
        MyCustomStack stack = new MyCustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.show();
        stack.pop();
        stack.peek();
        stack.show();

    }
}