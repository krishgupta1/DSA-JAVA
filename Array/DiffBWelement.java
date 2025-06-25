package Array;

public class DiffBWelement {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        int mainArraySum = 0;
        int digitSum = 0;
        for(int i = 0; i<nums.length; i++){
            mainArraySum += nums[i];
            int sum = 0;
            String s = String.valueOf(nums[i]);
            for(int j = 0; j<s.length(); j++){
                char number = s.charAt(j);
                int numberInt = Integer.parseInt(String.valueOf(number));
                sum += numberInt;
            }
            digitSum += sum;
        }
        int diff = mainArraySum - digitSum;
        System.out.println(diff);
    }
}
