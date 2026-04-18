class Solution {
    public int totalNQueens(int n) {
        char board[][] = new char[n][n];
        //Initialize
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]='X';
            }
        }

        return queens(board,0);
    }
     public int queens(char[][] board, int row){
        if(row== board.length){
            // printboard(board);
            return 1;
        }

        int count=0;
        for(int j=0;j<board.length;j++){
            if(safequeen(board,row,j)){
                board[row][j]='Q';
                count = count + queens(board,row+1);
                board[row][j]='X';
            }
        }
        return count;
    }

    private boolean safequeen(char[][] board, int row, int col) {
        //up direction check
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

}