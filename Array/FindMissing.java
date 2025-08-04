package Array;

import java.util.*;

public class FindMissing {
    public static void main(String[] args) {
        int [][]grid = {{1,3},{2,2}};
        int n = grid.length;
        int m = grid[0].length;

        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[2];
        for (int[] row : grid) {
            for (int val : row) {
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }

        for(int i = 0; i < n * m; i++){
                if (!map.containsKey(i+1)) {
                    res[1] = i + 1;
                }
                else if(map.get(i + 1) == 2){
                    res[0] = i + 1;
                }
        }
        System.out.println(Arrays.toString(res));
    }
}
