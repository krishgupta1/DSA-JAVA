package Array;

public class CountNumberOfPairs {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        int k = 2;
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[i]-nums[j] == k){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
