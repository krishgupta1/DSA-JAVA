package Array;

public class MatrixModify {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,-1},{4,-1,6},{7,8,9}};
        for(int i = 0; i<matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int k = 0; k<matrix.length; k++){
                if(matrix[i][k]>max){
                    max = matrix[i][k];
                }
            }
            for(int j = 0; j<matrix.length;j++){
                if(matrix[j][i] == -1){
                    matrix[j][i] = max;
                }
            }
        }
        for (int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
