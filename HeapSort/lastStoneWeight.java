package HeapSort;
import java.util.*;

public class lastStoneWeight {
    public static void main(String[] args) {
        int stone[] = {2, 7, 4, 1, 8, 1};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int integer : stone){
            pq.add(integer);
        }
        while(pq.size() > 1){
            int y = pq.poll();
            int x = pq.poll();
            if(x != y){
                pq.add(y - x);
            }
        }
        if(pq.size() == 0){
            System.out.println(0);
        }
        System.out.println(pq.peek());
    }
}
