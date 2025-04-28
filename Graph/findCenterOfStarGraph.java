package Graph;
import java.util.HashMap;

public class findCenterOfStarGraph {
    public static void main(String[] args) {
        int edges[][] = { { 1, 2 }, { 2, 3 }, { 4, 2 } };

        System.out.println(findCenter(edges));
    }


    public static int findCenter(int[][] edges) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];


            if (hashMap.containsKey(u)) {
                hashMap.put(u, hashMap.get(u) + 1);
            } else {
                hashMap.put(u, 1);
            }
            if (hashMap.containsKey(v)) {
                hashMap.put(v, hashMap.get(v) + 1);
            } else {
                hashMap.put(v, 1);
            }


            if (hashMap.get(u) == edges.length) {
                return u;
            }


            if (hashMap.get(v) == edges.length) {
                return v;
            }
        }


        return -1;
    }
}
