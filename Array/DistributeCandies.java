package Array;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1,1};
        int count = 0;
        for(int i = 0; i<candyType.length; i++){
            for(int j = i+1; j<candyType.length; j++)
            if(candyType[i] == candyType[i+1]){
                count = 1;
            }
            else{
                count = candyType.length/2;
            }
        }
        System.out.println(count);
    }
}
