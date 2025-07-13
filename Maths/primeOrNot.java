package Maths;

public class primeOrNot {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = false;
        for(int i = 1; i<num; i++){
            if(num % i == 0){
                isPrime = false;
                System.out.println(isPrime);
                break;
            }
            else{
                System.out.println(isPrime);
            }
        }
    }
}