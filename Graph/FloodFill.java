package Graph;
import java.util.*;

public class FloodFill {
    static int rows;
    static int columns;

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        FloodFill floodFillObj = new FloodFill(); // Create object
        int[][] result = floodFillObj.floodFill(image, sr, sc, color);
        
        // Print the resulting image
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        columns = image[0].length;

        boolean[][] visited = new boolean[rows][columns]; // false
        dfs(sr, sc, color, image[sr][sc], visited, image);
        return image;
    }

    void dfs(int row, int col, int newColor, int curColor, boolean visited[][], int image[][]){
        //out of bound cases
        if(row<0 || row>= rows || col<0 || col>=columns){
            return;
        }
        if(image[row][col] != curColor){
            return;
        }
        // Already Visited
        if(visited[row][col]){
            return;
        }

        image[row][col] = newColor;
        visited[row][col] = true;
        int adjList[][] = {{row-1, col}, {row, col+1}, {row+1, col}, {row, col-1}};
        for(int neighbour[] : adjList){
            dfs(neighbour[0], neighbour[1], newColor, curColor, visited, image);
        }
    }
}
