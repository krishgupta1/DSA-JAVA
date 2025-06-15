package GreedyAlgorithm;
import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int act[][] = new int[start.length][3];
        for(int i = 0 ; i<start.length; i++){
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        Arrays.sort(act, Comparator.comparingDouble(o ->o[2]));
        System.out.println();

        // Sorted on basis of End Time
        int maxAct = 0;
        ArrayList<Integer> ans =  new ArrayList<>();
        maxAct = 1;
        ans.add(act[0][0]);
        int lastEnd = act[0][2];
        for(int i = 0; i<end.length; i++){
            if (act[i][1]>= lastEnd) {
                maxAct++;
                ans.add(act[i][0]);
                lastEnd = act[i][2];
            }
        }
        for(int i = 0; i<ans.size(); i++){
            System.out.println("A" + ans.get(i));
        }
        System.out.println(maxAct);
    }
}