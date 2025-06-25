package LinkedList;

public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null; 
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
         }
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next  = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public int removefirst(){
        if(head == null){
            System.out.println("Doubly Linked List is Empty!!");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val =  head.data;
            head = tail = null;
            size--;
            System.out.println(val + " is Removed From DLL!");
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println(val + " is Removed From DLL!");
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev =  next;

            prev  = curr;
            curr = next;
        }
        head = prev;
    }
    


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addFirst(6);
        dll.print();
        System.out.println();
        dll.removeLast();
        dll.print();
    }
}
