package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PS20 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i <= nums.length - k; i++) {
            pq.clear();
            for (int j = i; j < i + k; j++) {
                pq.add(nums[j]);
            }
            arrayList.add(pq.peek());
        }

        int arr[] = new int[arrayList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayList.get(i);
        }

        return arr;
    }
}