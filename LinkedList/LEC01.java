package LinkedList;

import java.util.Scanner;

class Noden {
    int data;
    Noden next;

    Noden(int data){
        this.data = data;
        this.next = null;
    }
}

public class LEC01 {
    public static void main(String[] args) {
        Noden head =  new Noden(10);
        addNodeAfter(head);
        addNodeAfter(head);
        addNodeAfter(head);
        Noden newHead = addNodeBefore(head);
        printList(newHead);
        insertAtMiddle(head, 20, 50);
    }

    private static void insertAtMiddle(Noden head, int after, int data) {
        Noden temp = head;
//        while(temp.data == data){
//            temp = temp.data;
//        }
    }

    public static void addNodeAfter(Noden head){
        Scanner sc = new Scanner(System.in);
        Noden temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println("Enter the Data to Add After : ");
        int data = sc.nextInt();

        Noden newNode = new Noden(data);
        temp.next = newNode;

    } public static Noden addNodeBefore(Noden head){
        Scanner sc = new Scanner(System.in);
        Noden temp = head;

        System.out.println("Enter the Data to Add Before : ");
        int data = sc.nextInt();

        Noden newNode = new Noden(data);
        newNode.next = temp;
        head = newNode;
        return head;
    }
    private static void printList(Noden head) {
        Noden temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    //
}
