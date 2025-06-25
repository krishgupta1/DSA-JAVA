package Array;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}; 
        int target = 3;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int hi = rows * cols - 1;

        while (low<=hi) {
            int mid = low + (hi - low) /2;
            int row = mid / cols;
            int col = mid % cols;
            int midVal = matrix[row][col];
            if(midVal == target){
                System.out.println("True");
            }
            else if(midVal < target){
                low = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }   
    }
}
