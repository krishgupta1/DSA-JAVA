package Array;

public class Convert1Dto2D {
    public static void main(String[] args) {
        int[] original = {1,2};
        int m = 1, n = 1;
//        if(original.length != m*n){
//            return new int[0][0];
//        }
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j = 0; j<n; j++){
                res[i][j] = original[i*n+j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(res));
    }
}
