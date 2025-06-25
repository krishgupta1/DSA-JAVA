package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindThePeak {
    public static void main(String[] args) {
        int[] mountain = {1,4,3,8,5};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<mountain.length; i++){
            if(i > 0 && i < mountain.length-1){
                System.out.println(i);
                if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                    list.add(i);
                }
            }
        }
        System.out.println(Arrays.toString(list.toArray()));

    }
}
