package Stack;

import java.util.Stack;

public class LargestRectangleinHistogram {
    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        // BFA
        // int max = 0;
        // for (int i = 0; i < heights.length; i++) {
        //     int minH = Integer.MAX_VALUE;
        //     for (int j = i; j < heights.length; j++) {
        //         minH = Math.min(minH, heights[j]);
        //         max = Math.max(max, (j - i + 1) * minH);
        //     }
        // }


        int[] nsei = new int[heights.length];
        int[] psei = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            nsei[i] = heights.length;
            psei[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nsei.length; i++) {
            while (true) {
                if (stack.isEmpty()) {
                    stack.push(i);
                    break;
                }
                int idx = stack.peek();
                if (heights[i] < heights[idx]) {
                    nsei[idx] = i;
                    stack.pop();
                } else {
                    stack.push(i);
                    break;
                }
            }
        }

        stack.clear();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (true) {
                if (stack.isEmpty()) {
                    stack.push(i);
                    break;
                }
                int idx = stack.peek();
                if (heights[i] < heights[idx]) {
                    psei[idx] = i;
                    stack.pop();
                } else {
                    stack.push(i);
                    break;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max, heights[i] * (nsei[i] - psei[i] - 1));
        }
        System.out.println(max);
    }
}
