package HeapSort;
import java.util.*;

public class PS01{
    public static void main(String args[]){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(17);
        minHeap.add(30);
        minHeap.add(40);

        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.add(17);
        maxHeap.add(30);
        maxHeap.add(40);

        System.out.println("MinHeap -> Min Value : " + minHeap.peek());
        System.out.println("MaxHeap -> Max Value : " + maxHeap.peek());

        PriorityQueue<Integer> minHeapUsingHeapify = new PriorityQueue<>(Arrays.asList(20,10,17,30,40));
        System.out.println("Min Heap 2 : " + minHeapUsingHeapify.peek());
    }
}