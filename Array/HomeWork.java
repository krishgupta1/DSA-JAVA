package Array;

public class HomeWork {
    public static void main(String[] args) {
        int[]startTime = {4};
        int[] endTime = {4};
        int queryTime = 4;
        int counter = 0;
        for(int i = 0; i<startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i]>=queryTime){
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
