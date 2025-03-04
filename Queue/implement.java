
public class implement {   
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int [n];
            size = n;
            rear = -1;
        }

        // Check isEmpty()
        public boolean isEmpty(){
            return rear == -1;
        }

        //Add
        public void add(int data){
            if(rear == size - 1){
                System.out.println("Queue is Full!!");
                return;
            }
            rear += 1;
            arr[rear] = data;
        }

        // Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front  = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;

        }
        public int  peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}