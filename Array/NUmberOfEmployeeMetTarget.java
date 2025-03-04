package Array;

public class NUmberOfEmployeeMetTarget {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        int counter = 0;
        for(int i = 0; i<hours.length; i++){
            if(hours[i]>= target){
                counter++;
            }
        }
        System.out.println(counter);
    }   
}
