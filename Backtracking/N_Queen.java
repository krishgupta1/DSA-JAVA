package Backtracking;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i = 0; i< n;  i++){
            for(int j = 0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        // nQueens(board, 0);
        // System.out.println(count);
        if(nQueensPrint1(board, 0)){
            System.out.println("Solution is Possible");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible!!");
        }
    }
    static int count;

    public static void nQueens(char board[][], int row){
        //Base case
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
        //Column Loop
        for(int j = 0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);//function call
                board[row][j] = 'x';//backtracking step
            }
        }
    }

    public static boolean nQueensPrint1(char board[][], int row){
        //Base case
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
        }
        //Column Loop
        for(int j = 0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueensPrint1(board, row+1)){//function call
                    return true;
                }
                board[row][j] = 'x';//backtracking step
            }
        }
        return false;
    }
    private static boolean isSafe(char[][] board, int row, int col) {
        //vertically Up
        for (int i = row-1; i >= 0; i--) {
            if(board[i][col] == 'Q' ){
                return false;
            }
        }
        //diag left up
        for (int i = row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diag right up
        for (int i = row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("----- Chess Board -----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
