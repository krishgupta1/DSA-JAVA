package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PS01 {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
    }

    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        ArrayList<Integer> indexArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indexArr.add(i);
        }

        Collections.sort(indexArr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(finish[a], finish[b]);
            }
        });
    }
}