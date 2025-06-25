package Array;

import java.util.ArrayList;
import java.util.List;

public class CountPairsWhoseSumisLessthanTarget {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        int target = 2;
        int count = 0;

        for(int i  = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) < target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
