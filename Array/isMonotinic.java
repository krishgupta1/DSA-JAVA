package Array;

public class isMonotinic {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        if(ascending(nums)){
            System.out.println("Monotinic Array");
        }
        else if(desceding(nums)){
            System.out.println("Not Monotonic");
        }
    }
    public static boolean ascending(int nums[]) {
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] > nums[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean desceding(int nums[]) {
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] < nums[i]){
                return false;
            }
        }
        return true;
    }
    
}
