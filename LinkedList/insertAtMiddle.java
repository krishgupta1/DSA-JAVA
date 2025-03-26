package LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertAtMiddle{
    public static void main(String[] args) {
        System.out.println("Enter the value for the node");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        Node head = new Node(data);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        insertInMiddle(head,20);
        printList(head);
    }

    private static void addNodeAfter(Node head) {
        Scanner sc = new Scanner(System.in);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println("Enter the value for the node");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        temp.next = newNode;
    }

    private static Node addNodeBefore(Node head) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the node");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    private static void deleteLastNode(Node node) {
        node = null;
    }

    private static Node findNode(Node node, int data) {
        Node curr = node;
        while (curr != null) {
            if (curr.data == data) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    private static Node insertInMiddle(Node head, int data) {
        Scanner sc = new Scanner(System.in);
        Node temp = head;
        while (temp.data == data){
            temp = temp.next;
        }
        System.out.println("Enter the value at middle");
        int value = sc.nextInt();
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        sc.close();
        return temp;
    }
}