package Maths;

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        // int count = 0;
        // while (num != 0) {
        //     int rem = num % 10;
        //     count ++;
        //     num /= 10;
        // }
        // System.out.println(count);
        digitC(num);
    }   
    static void digitC(int num){
        if(num == 0){
            System.out.println("Digit are 1");
            return;
        }
        int count = (int) Math.log10(num) + 1;
        System.out.println("Digit : " + count);

    }
}
