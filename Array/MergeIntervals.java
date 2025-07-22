package Array;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (result.isEmpty() || result.get(result.size() - 1)[1] < intervals[i][0]) {
                result.add(intervals[i]);
            }
            else {
                int[] lastInterval = result.get(result.size() - 1);
                if (intervals[i][1] > lastInterval[1]) {
                    lastInterval[1] = intervals[i][1];
                }
            }
        }

        int[][] merged = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            merged[i] = result.get(i);
        }

        System.out.println(Arrays.deepToString(merged));
    }
}
