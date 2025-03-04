import java.util.*;

public class DeQueImplementation {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addLast(100);
        System.out.println(dq);

        dq.removeFirst();
        dq.addFirst(20);
        dq.addLast(90);

        dq.removeLast();
        dq.addFirst (30);
        dq.addLast(70);
        System.out.println(dq);
        

    }
}
