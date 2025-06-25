package Array;

public class MinElementAfterReplacement {
    public static void main(String[] args) {
        int[] nums = {10,12,13,14};
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            String s = String.valueOf(nums[i]);
            for (int j = 0; j < s.length(); j++) {
                char numberS = s.charAt(j);
                int numberInt = Integer.parseInt(String.valueOf(numberS));
                sum += numberInt;
            }
            MIN = Math.min(MIN, sum);
        }
        System.out.println(MIN);
    }
}
