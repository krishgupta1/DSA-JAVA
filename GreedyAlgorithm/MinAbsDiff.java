package GreedyAlgorithm;
import java.util.Arrays;

public class MinAbsDiff {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int minD= 0;
        for(int i = 0; i<A.length; i++){
            minD += Math.abs(A[i]-B[i]);
        }
        System.out.println("Min Diff Of Pairs : " + minD);
    }
}