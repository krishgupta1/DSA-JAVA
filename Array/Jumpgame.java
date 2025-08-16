package Array;

public class Jumpgame {
    public static void main(String[] args) {
        int[]nums = {3,2,1,0,4};

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]+1 == nums[i+1] && nums[i+1] < nums[nums.length-1] ){
                System.out.println(true);
                break;
            }
            else{
                System.out.println(false);
            }
        }
    }
}
