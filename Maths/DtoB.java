package Maths;
public class DtoB {
    public static void main(String[] args) {
        decimalToBinary(5);
    }
    static void decimalToBinary(int decimalNum){
        int resNum = 0;
        int power = 0;
        while(decimalNum > 0){
            int rem = decimalNum % 2;
            decimalNum /= 2;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.println("Binary : " + resNum);
    }
}
