package Array;

public class LastStone {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<stones.length-1; i++){
            if(stones[i]>max){
                max = stones[i];
            }
            else if(stones[i]<max ){
                min = stones[i];
            }
        }
        System.out.println(min + max);
    }   
}
