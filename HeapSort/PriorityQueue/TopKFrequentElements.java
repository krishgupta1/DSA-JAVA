package HeapSort.PriorityQueue;
import java.util.*;

public class TopKFrequentElements {
    static class Number implements Comparable<Number>{
        int element;
        int freq;

        Number(int element, int freq){
            this.element = element;
             this.freq = freq;
        }
        public int compareTo(Number that){
            //max heap
            return that.freq - this.freq;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,1,2,1,3};
        int k = 2;  

        PriorityQueue<Number> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // find freq of all elements
        for(int element : nums){
            freqMap.put(element, freqMap.getOrDefault(element, 0) +1);
        }

        //insert element in pq
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            Number number = new Number(entry.getKey(), entry.getValue());
            pq.offer(number);
        }

        int res[] = new int[k];
        int idx = 0;
         while(idx < k){
            Number num = pq.poll();
            res[idx] = num.element;
            idx++;
         }
         System.out.println(Arrays.toString(res));

    }
}
