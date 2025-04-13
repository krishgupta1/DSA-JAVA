package Queue;
class MyQueue{
    private int[] customQueue;
    int f;
    int r;
    int size;

    MyQueue(int size){
        this.customQueue = new int[size];
        this.f = 0;
        this.r = -1;
    }

    public boolean isEmpty(){
        return f > r;
    }

    public boolean isFull(){
        return r == customQueue.length-1; 
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Full");
            return;
        }
        customQueue[++r] = data;
        System.out.println("Data added : " + data);
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int data = customQueue[f];
        f++;
        System.out.println("data removed : " + data);
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = f; i<=r; i++){
            System.out.println(customQueue[i]);
        }
    }
}
public class implement {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
    }
}
