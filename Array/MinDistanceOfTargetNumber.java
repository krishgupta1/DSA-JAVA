package Array;

public class MinDistanceOfTargetNumber {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
        int target = 5;
        int start = 3;
        int index = 0;
        int distance = 0;
        for(int i = 0; i<nums.length; i++){
            if(target == nums[i]){
                index = i;
            }
        }

        distance = (index - start) > 0 ? (index - start) : (start - index);
        System.out.println(distance);
    }
}
