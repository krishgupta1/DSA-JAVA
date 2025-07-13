package Maths;

public class BtoD {
    public static void main(String[] args) {
        binaryToDecimal(101);
    }
    static void binaryToDecimal(int binaryNum){
        int res = 0;
        int power = 0;
        while(binaryNum > 0){
            int rem = binaryNum % 10;
            res += rem * Math.pow(2, power);
            power++;
            binaryNum /= 10;
        }
        System.out.println("Decimal : " + res);
    }
}
