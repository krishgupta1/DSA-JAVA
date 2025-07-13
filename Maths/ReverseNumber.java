package Maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123;
        reverse(number);
    }
    static void reverse(int number){
        int res = 0;
        while(number > 0){
            int rem = number % 10;
            res = res * 10 + rem;
            number /= 10;
        }
        System.out.println(res);
    }
}
