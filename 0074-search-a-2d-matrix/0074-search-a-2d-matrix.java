class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                System.out.println("Found in position at :- ["+row+","+col+"]");
                return true;
            }

            else if(matrix[row][col]<target){
                row++;
            }

            else{
                col--;
            }
        }
        System.out.println("Not Found");
        return false;
    }
}