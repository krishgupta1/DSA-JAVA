package Array;

public class EvenNumberOfDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int countNumsWithEvenDigit = 0;
        for(int i = 0; i<nums.length; i++){
            int countDigit = 0;
            String s = String.valueOf(nums[i]);
            for(int j = 0; j<s.length(); j++){
                countDigit++;
            }
            if(countDigit % 2 == 0){
                countNumsWithEvenDigit++;
            }
        }
        System.out.println(countNumsWithEvenDigit);
    }
}
