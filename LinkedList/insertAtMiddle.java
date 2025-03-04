package LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Noden next;

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
        Noden head = new Noden(data);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        insertInMiddle(head,20);
        printList(head);
    }

    private static void addNodeAfter(Noden head) {
        Scanner sc = new Scanner(System.in);
        Noden temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println("Enter the value for the node");
        int data = sc.nextInt();
        Noden newNode = new Noden(data);
        temp.next = newNode;
    }

    private static Noden addNodeBefore(Noden head) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the node");
        int data = sc.nextInt();
        Noden newNode = new Noden(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static void printList(Noden head) {
        Noden temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    private static void deleteLastNode(Noden node) {
        node = null;
    }

    private static Noden findNode(Noden node, int data) {
        Noden curr = node;
        while (curr != null) {
            if (curr.data == data) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    private static Noden insertInMiddle(Noden head, int data) {
        Scanner sc = new Scanner(System.in);
        Noden temp = head;
        while (temp.data == data){
            temp = temp.next;
        }
        System.out.println("Enter the value at middle");
        int value = sc.nextInt();
        Noden newNode = new Noden(value);
        newNode.next = temp.next;
        temp.next = newNode;
        sc.close();
        return temp;
    }
}