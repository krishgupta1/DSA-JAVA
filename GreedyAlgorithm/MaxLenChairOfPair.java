package GreedyAlgorithm;
import java.util.*;

public class MaxLenChairOfPair {
    public static void main(String[] args) {
        int pairs[][] = {{5,24}, {39,60}, {5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int max = 0;
        max = 1;
        int lastIndex = pairs[0][1];
        for(int i = 0; i<pairs.length; i++){
            if(pairs[i][0] > lastIndex){
                max++;
                lastIndex = pairs[i][1];
            }
        }
        System.out.println(max);
    }
}