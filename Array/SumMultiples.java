package Array;

public class SumMultiples {
   public static void main(String[] args) {
    int n = 7;
    int sum = 0;
    for(int i = 1; i<=7; i++){
        if(i%3 == 0){
            sum+=i;
        }
        if(i%5 == 0){
            sum+=i;
        }
        if(i%7 == 0){
            sum+=i;
        }
    }
    System.out.println(sum);
   } 
}
