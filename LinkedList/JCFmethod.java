package LinkedList;

import java.util.LinkedList;

public class JCFmethod {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(3);
        System.out.println(ll);
        System.out.println(ll.get(ll.size()/2));
    }
}
