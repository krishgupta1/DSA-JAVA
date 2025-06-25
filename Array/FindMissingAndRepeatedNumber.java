package Array;
/// ///////// NOT COMPLETED
public class FindMissingAndRepeatedNumber {
    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,2}};
        int count = 0;
        int[] newArr = new int[grid.length];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                count++;
                if(grid[i][j]==count){
                    System.out.println("HI");
                }
            }
        }
        System.out.println(count);
    }
}
