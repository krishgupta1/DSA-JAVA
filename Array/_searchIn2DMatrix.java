package Array;

public class _searchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int midVal = matrix[row][col];
            if(midVal == target){
                System.out.println("True");
            }
            else if(midVal < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }

        }
    }
}
