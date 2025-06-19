package HeapSort;
import java.util.*;

public class KthLargestElementStream {
    public static void main(String[] args) {
        KthLargest obj = new KthLargest(3, new int[] { 4, 5, 8, 2 });
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }
}

class KthLargest {
    private PriorityQueue<Integer> maxHeap;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.add(num);
        }
    }

    public int add(int val) {
        maxHeap.add(val);
        PriorityQueue<Integer> temp = new PriorityQueue<>(maxHeap);
        int res = 0;
        for (int i = 0; i < k; i++) {
            res=temp.poll();
        }
        return res;
    }
}