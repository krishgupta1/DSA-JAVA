package Array;

public class KeepMultiplyByTwo {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        int result = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == original){
                original *= 2;
                result = original;
            }
            else{
                System.out.println(original);
            }
        }
        System.out.println(result);
    }
}
