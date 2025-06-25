package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoLL {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(List.of(1,2,4));
        LinkedList<Integer> l2 = new LinkedList<>(List.of(1,3,4));
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        
        for(int i = 0; i<l1.size();i++){
            a1.add(l1.get(i));
        }

        for(int i = 0; i<l2.size();i++){
            a2.add(l2.get(i));
        }

        ArrayList<Integer> mergedList = new ArrayList<>(a1);
        mergedList.addAll(a2);
        int[] res = new int[mergedList.size()];
        for(int i = 0; i<mergedList.size(); i++){
            res[i] = mergedList.get(i);
        }

        Arrays.sort(res);

        LinkedList<Integer> result = new LinkedList<>();
        for(int i = 0; i<res.length; i++){
            result.addLast(res[i]);
        }
        System.out.println(result);
    }
}
