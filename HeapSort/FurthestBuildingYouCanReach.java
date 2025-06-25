package HeapSort;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int [] heights = {4,2,7,6,9,14,12};
        int  bricks = 5, ladders = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<heights.length; i++){
            int diff = heights[i+1] - heights[i];
            if(diff>0){
                pq.add(diff);
            }
            if(pq.size() > ladders){
                bricks -= pq.poll();
            }
            if(bricks<0){
                System.out.println(i);
            }
        }
        System.out.println(pq);
    }
}
