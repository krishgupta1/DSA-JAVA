package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int low = 0;
        int val = 50;
        int high = arr.length -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Avoid potential overflow
            if (arr[mid] == val) {
                System.out.println(mid);  // Found the element, return the index
//                return mid;  // Return the index of the element
                break;
            }
            else if (arr[mid] < val) {
                low = mid + 1;  // Search in the right half
                break;
            }
            else {
                high = mid - 1;  // Search in the left half
                break;
            }
        }
        System.out.println("bife");
    }
}
