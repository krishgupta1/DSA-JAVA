package Stack;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int []nums = {1,2,1};
        int []res = new int[nums.length];
        Stack <Integer> stack = new Stack<>();
        for(int i = 0; i<nums.length; i++){
            res[i] = -1;
        }

        for (int i = 0; i<nums.length; i++) {
            while (true) {
                if(stack.isEmpty()){
                    stack.add(i);
                    break;
                }
                int idx = stack.peek();
                if(nums[i] > nums[idx]){
                    res[idx] = nums[i];
                    stack.pop();
                }
                else{
                    stack.push(i);
                    break;
                }
            }
        }
        for (int i = 0; i<nums.length; i++) {
            while (true) {
                if(stack.isEmpty()){
                    stack.add(i);
                    break;
                }
                int idx = stack.peek();
                if(nums[i] > nums[idx]){
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