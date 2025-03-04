package Array;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j]==target){
                    System.out.println("True");
                }
            }
        }
        System.out.println("False");
    }
}
