package Array;

import java.util.ArrayList;

public class KidWithGreatest {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        ArrayList<Boolean> list = new ArrayList();

        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        for(int i = 0; i<candies.length; i++){
            if(candies[i] + extraCandies >= maxCandies){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        System.out.println(list);

    }
}
