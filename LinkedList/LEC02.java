package LinkedList;

import java.sql.Statement;
import java.util.Scanner;

class Nodes {
    int data;
    Nodes next;


    Nodes (int data){
        this.data = data;
        this.next = null;
    }
}

public class LEC02 {
    public static void main(String[] args) {
        Nodes head =  new Nodes(10);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        printList(head);
        Nodes node = findNode(head, 30);
        printList(head);
        deleteLast(node);
        printList(head);
    }

    public static void addNodeAfter(Nodes head){
        Scanner sc = new Scanner(System.in);
        Nodes temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println("Enter the Data to Add After : ");
        int data = sc.nextInt();

        Nodes newNode = new Nodes(data);
        temp.next = newNode;

    }

    private static void printList(Nodes head) {
        Nodes temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    private static Nodes findNode(Nodes node, int data){
        Nodes current = node;
        while (current != null){
            if(current.data == data){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private static void deleteLast(Nodes node){
        node = null;
    }

    public static Nodes addNodeBefore(Nodes head){
        Scanner sc = new Scanner(System.in);
        Nodes temp = head;

        System.out.println("Enter the Data to Add Before : ");
        int data = sc.nextInt();

        Nodes newNode = new Nodes(data);
        newNode.next = temp;
        head = newNode;
        return head;
    }

}
