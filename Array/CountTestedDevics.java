package Array;

public class CountTestedDevics {
    public static void main(String[] args) {
        int[] batteryPercentages = {1,1,2,1,3};
        int counter = 0;

        for(int i = 0; i < batteryPercentages.length; i++){
            if(batteryPercentages[i]>0){
                counter++;
                for(int j = i+1; j<batteryPercentages.length; j++){
                    batteryPercentages[j]= batteryPercentages[j]-1;
                }
            }
        }
        System.out.println(counter);
    }
}
