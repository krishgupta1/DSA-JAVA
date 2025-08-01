package Stack;
import java.util.*;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int []nums = {3,9,4,0,2};
        int []res = new int[nums.length];

        Stack <Integer> stack = new Stack<>();
        for(int i = 0; i<nums.length; i++){
            res[i] = -1;
        }

        for (int i = nums.length-1; i>=0; i--) {
            while (true) {
                if(stack.isEmpty()){
                    stack.add(i);
                    break;
                }
                int idx = stack.peek();
                if(nums[i] < nums[idx]){
                    res[idx] = nums[i];
                    stack.pop();
                }
                else{
                    stack.push(i);
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(res));
    }
}