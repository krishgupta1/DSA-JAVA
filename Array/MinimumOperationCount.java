package Array;

public class MinimumOperationCount {
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        int count = 0;
        for(int num : nums){
            if(num < k){
                count++;
            }
        }
        System.out.println(count);
    }
}
