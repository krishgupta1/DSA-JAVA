package Array;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int []nums = {3,2,4};
        int target = 6;

        int res[][] = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            res[i][0] = nums[i];
            res[i][1] = i;
        }

        Arrays.sort(res, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int sum = res[left][0] + res[right][0];
            if(sum == target){
               System.out.println(Arrays.toString(new int[] {res[left][1], res[right][1]})); 
                break;
            }
            else if( sum < target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
