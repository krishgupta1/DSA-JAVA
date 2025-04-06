package Array;

public class MinimumNoToMoveSeat {
    public static void main(String[] args) {
        int[] seats = {3,1,5}, students = {2,7,4};
        
        int count = 0;
        for(int i = 0; i <students.length; i++){
            int min = Integer.MAX_VALUE;
            int num = students[i];
            for(int j = 0; j<seats.length; j++){
                int sum = num - seats[j];
                if(sum  > min){
                    count += sum;
                }
            }
        }
        System.out.println(count);
    }
}
