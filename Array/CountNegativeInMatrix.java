package Array;

public class CountNegativeInMatrix {
    public static void main(String[] args) {
        int[][] mat = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int negativeCount = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j]<0){
                    negativeCount++;
                }
            }
        }
        System.out.println(negativeCount);
    }
}
