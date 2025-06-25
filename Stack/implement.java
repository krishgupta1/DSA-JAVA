package Stack;

class MyCustomStack {
    int[] customStack;
    int tos;
    int size;

    MyCustomStack(int size) {
        this.size = size;
        this.customStack = new int[size];
        this.tos = -1;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Value removed " + customStack[this.tos]);
        tos--;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        tos = tos + 1;
        customStack[tos] = data;
        System.out.println("Data is Inserted " + data);
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = tos; i >= 0; i--) {
            System.out.println(customStack[i]);
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println(customStack[tos]);

    }

    public boolean isEmpty() {
        return tos == -1;
    }

    public boolean isFull() {
        return tos == customStack.length - 1;
    }

}

public class implement {
    public static void main(String[] args) {
        MyCustomStack stack = new MyCustomStack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.show();
        stack.pop();
        stack.peek();
    }
}