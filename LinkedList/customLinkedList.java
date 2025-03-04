package LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class customLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Value : ");
        int firstValue = sc.nextInt();
        Node head = new Node(firstValue);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        printList(head);
    }
    public static void addNodeAfter(Node head){
        Node temp = head;
        Scanner sc = new Scanner(System.in);
        while(temp.next!=null){
            temp = temp.next;
        }
        System.out.println("Enter the data for Node : ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        temp.next = newNode;
        sc.close();
    }
    private static void printList(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
//        System.out.print(temp.data);
        System.out.print("Null");
    }
}
