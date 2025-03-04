package Array;

public class SumofVariableLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = {2,3,1};

        int res = 0;

        for(int i = 0; i < nums.length; i++){
            int start = Math.max(0, i - nums[i]);
            for(int j = start; j <= i; j++){
                res += nums[j];
            }
        }
        System.out.println(res);
    }
}
