package Maths;


public class CheckPrime {
    public static void main(String[] args) {
        int n = 40;
        for(int i = 1; i<n; i++){
            if(prime(i) == true){
                System.out.println(i);
            }
        }
    }
    static boolean prime(int num){
        boolean flag = true;
        for(int i = 2; i < 10; i++){
            if(num % i == 0 && num != i){
                flag = false;
            }
        }
        return flag;
    }
}
