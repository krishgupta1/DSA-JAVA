package Array;


public class MinimumPairSum {
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        int n = nums.length;
        boolean [] isRemoved = new boolean[n];
        int count = 0;

        for(int i = 0; i < nums.length-1; i++){
            if(!isRemoved[i] && !isRemoved[i+1]){
                if(nums[i] > nums[i+1]){
                    isRemoved[i] = true;
                    isRemoved[i+1] = true;
                    count++;
                 }
                
            }
        }
        System.out.println(count);

    }
}
