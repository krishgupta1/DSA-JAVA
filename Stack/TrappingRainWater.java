package Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        int []height = {0,1,0,2,1,0,1,3,2,1,2,1};
        // BFA
        // int water = 0;
        
        // for(int i = 1; i<height.length - 1; i++){
        //     int curr = height[i];
        //     int leftMax = curr;
        //     int rightMax = curr;

        //     for(int j = i - 1; j >= 0; j--){
        //         leftMax = Math.max(leftMax, height[j]);
        //     }
        //     for(int j = i + 1; j < height.length; j++){
        //         rightMax = Math.max(rightMax, height[j]);
        //         if (rightMax >= leftMax) {
        //             break;
        //         }
        //     }
        //     water = water + Math.min(leftMax, rightMax) -  curr;
        // }
        // System.out.println(water);


        // Optimised L1
        // int water = 0;
        // int leftMax[] = new int[height.length];
        // leftMax[0] = height[0];
        // int []rightMax = new int[height.length];

        // rightMax[height.length - 1] = height[height.length - 1];
        // for (int i = 1; i < height.length; i++) {
        //     leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        // }
        // for (int i = height.length-2; i >= 0; i--) {
        //     rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        // }
        // for (int i = 1; i < height.length - 1; i++) {
        //     water = water + Math.min(leftMax[i], rightMax[i]) - height[i];
        // }
        // System.out.println(water);

        // Optimised L2

        int water = 0;
        int left = 1;
        int right = height.length - 2;
        
        int leftMax = height[0];
        int rightMax = height[height.length - 1];

        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(right < left){
                water = water + (rightMax - height[right]);
                right = right - 1;
            }
            else{
                water = water + (leftMax - height[left]);
                left = left + 1;
            }
        }
        System.out.println(water);

    }
}
