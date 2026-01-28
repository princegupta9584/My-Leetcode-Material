class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] newcol = new int[m];


        for (int j = 0; j < m; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] != -1) {
                    max = Math.max(max, matrix[i][j]);
                }
            }
            newcol[j] = max;
        }

        
        int[][] answer = new int[n][m];

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != -1) {
                    answer[i][j] = matrix[i][j];
                } else {
                    answer[i][j] = newcol[j];
                }
            }
        }

        return answer;
    }
}
