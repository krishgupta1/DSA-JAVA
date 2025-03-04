package LinkedList.A_C;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Methods to Add First
    public void addFirst(int data){
        // Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //newNode next = head
        newNode.next = head;

        // head = newNode
        head = newNode;
    }

    //Methods to Add First
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Method to Add in the Middle

    public void addMiddle(int data, int index){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i<index-1) {
            temp = temp.next;
            i++;            
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // Methods to Remove from First
    public int removeFirst(){
        if(size == 0){
            System.out.println("List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    // Remove from Last
    public int removeLast(){
        Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    // Remove from end middle at specific position
    public void removeMiddle(int n){
        // Calculate Size of linked list
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return;
        }
        int index = 1;
        int iToFind = size - n;
        Node prev = head;

        while(index < iToFind){
            prev = prev.next;
            index++;
        }
        prev.next = prev.next.next;
        return;
    }

    
    // Methods to Print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to Search
    public int search(int key){
        Node temp = head;
        int index = 0;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                index = i;
            }
            temp = temp.next;
            i++;
        }
        return index;
    }

    // Recursive Search

    public int helper (Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    // Reverse LL
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.addLast(10);
        ll.addLast(15);

        ll.addMiddle(12, 4);

        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.tail);
        System.out.println(ll.removeLast());
        System.out.println(ll.size);
        ll.print();

        System.out.println(ll.recSearch(1));

        ll.reverse();
        ll.print();
        ll.removeMiddle(1);
        ll.print();
    }
}
