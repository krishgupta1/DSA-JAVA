package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Rank {
    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        HashMap<Integer, String> map = new HashMap<>();
        int n = score.length;

        int [] ans = score.clone();
        Arrays.sort(ans);
        String[] res = new String[n];

        for(int i = 0; i<n; i++){
            int rank = n - i;
            if(rank == 1){
                map.put(ans[i], "Gold Medal");
            }
            else if(rank == 2){
                map.put(ans[i], "Silver Medal");
            }
            else if(rank == 3){
                map.put(ans[i], "Bronze Medal");
            }
            else{
                map.put(ans[i], String.valueOf(i));
            }
        }
        for(int i = 0; i<n; i++){
            res[i] = map.get(score[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
