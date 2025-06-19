package HeapSort;

import java.util.*;

public class RankTransformOfArray {
    public static void main(String[] args) {
        int arr[] = {40,10,20,30};
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int x[], int y[]){
                return x[0] - y[0];
            }             
        });

        ArrayList<Integer> idxArr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            pq.offer(new int[]{arr[i], i});
        }
        
        int rank = 0;
        int prev = Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            int cur[] = pq.poll();
            if(prev != cur[0]){
                prev = cur[0];
                rank++;
            }
            arr[cur[1]] = rank;
        }
        System.out.println(Arrays.toString(arr));
    }
}
