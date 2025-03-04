package Array;

public class checkTriangle {
    public static void main(String[] args) {
        int[] nums = {3,3,3};
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            System.out.println("Equal");
        }
        else if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2]){
            System.out.println("isosceles");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
