package Array;

public class PS49 {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 4, 5 };
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int num1 = maxValue(nums, Integer.MIN_VALUE);
        int num2 = maxValue(nums, num1);
        return (num1 - 1) * (num2 - 1);
    }

    public static int maxValue(int[] nums, int max) {
        int secondMax = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMax && nums[i] != i) {
                secondMax = nums[i];
                index = i;
            }
        }
        return secondMax;
    }
}