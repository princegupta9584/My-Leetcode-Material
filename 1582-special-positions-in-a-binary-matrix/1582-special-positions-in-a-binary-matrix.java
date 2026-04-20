class Solution {
    public int numSpecial(int[][] mat) {
     int m=mat.length;
     int n=mat[0].length;

    int count=0;
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==1){
                mat[i][j]=0;
                 if(isSafe(mat,i,j)){
                count++;
            }
            mat[i][j]=1;
            }
        }
     }
     return count;
    }

    public boolean isSafe(int[][] mat, int row, int col){
        //row check
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]==1){
                return false;
            }
        }

        //column check
        for(int i=0;i<mat[0].length;i++){
            if(mat[row][i]==1){
                return false;
            }
        }
        return true;
    }
}