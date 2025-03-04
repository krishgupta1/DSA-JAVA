package Array;

public class SignoftheProductofanArray {
    public static void main(String[] args) {
        int[] nums = {7,36,96,70,85,23,5,18,4,12,89,92,9,30,53,14,96,32,13,43,37,60,75,7,83,68,20,8,-24,-80,-27,-92,-96,-20,-16,-52,-49,-38};
        int product = 1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                System.out.println(0);
            }
            product *= nums[i];
        }
        if (product > 0) {
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }
    }
}
