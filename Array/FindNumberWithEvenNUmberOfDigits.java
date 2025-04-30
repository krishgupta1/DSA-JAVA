package Array;

public class FindNumberWithEvenNUmberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int countEven = 0;
        for(int i = 0; i<nums.length; i++){
            int countDig = 0;
            String s = String.valueOf(i);
            for(int j = 0; j<s.length(); j++){
                countDig++;
            }
            if(countDig%2 == 0){
                countEven++;
            }
        }
    }
}
