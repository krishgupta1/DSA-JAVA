public class CircularQueueImplementationArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int [n];
            size = n;
            rear = -1;
            front = -1;
        }

        // Check isEmpty()
        public boolean isEmpty(){
            return rear == -1 && front ==-1;
        }

        //Check isFull()
        public static boolean isFull(){
            return (rear + 1) % size == front;
        }

        //Add
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full!!");
                return;
            }
            // Add Frist Element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            // Last Element Delete
            if(rear == front){
                rear = front = -1; 
            }
            else{
                front = (front + 1) % size;
            }
            return result;

        }
        public int  peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}