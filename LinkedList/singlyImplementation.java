package LinkedList;

public class singlyImplementation {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //Create New Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //  New Node next = head
        newNode.next  = head;
        // head =  newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode =  new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;   
        }
        System.out.print("null");
        
    }


    public void addInMiddle(int data, int position){
        if(position == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<position-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void size(){
        System.out.println();
        System.out.println("Size : " + size);
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = head.next;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
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

    public int search(int value){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data == value){
                System.out.println();
                System.out.println(i);
                return i;
            }
            temp = temp.next;
            i++;
            
        }
        return -1;
    }

    // Search Recursively
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int rec(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev  = null;
        Node curr = tail =  head;
        Node next;
        while(curr != null){
            next =  curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        head = prev;
    }

    public static void main(String[] args) {
        singlyImplementation n = new singlyImplementation();
        n.addFirst(10);
        n.addFirst(20);
        n.addFirst(30);
        n.addFirst(40);
        n.addLast(100);
        n.addInMiddle(50, 0);
        // n.print();
        // n.size();
        // // System.out.println(n.removeFirst());
        // n.print();System.out.println();
        // n.removeLast();
        
        n.print();
        // n.search(10);
        // System.out.println(n.rec(40));
        System.out.println();
        n.reverse();
        n.print();
    }
}