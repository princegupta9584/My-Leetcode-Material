import java.util.ArrayList;

class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {

        int left = 0;
        int top = 0;
        int bottom = grid.length - 1;
        int right = grid[0].length - 1;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> rotateList = new ArrayList<>();

        while (top < bottom && left < right) {

            // extract
            for (int i = left; i <= right; i++) {
                list.add(grid[top][i]);
            }

            for (int j = top + 1; j <= bottom; j++) {
                list.add(grid[j][right]);
            }

            for (int i = right - 1; i >= left; i--) {
                list.add(grid[bottom][i]);
            }

            for (int j = bottom - 1; j > top; j--) {
                list.add(grid[j][left]);
            }

            int rotation = k % list.size();

            // rotate
            for (int i = rotation; i < list.size(); i++) {
                rotateList.add(list.get(i));
            }

            for (int i = 0; i < rotation; i++) {
                rotateList.add(list.get(i));
            }

            // fill back
            int counter = 0;

            for (int i = left; i <= right; i++) {
                grid[top][i] = rotateList.get(counter++);
            }

            for (int j = top + 1; j <= bottom; j++) {
                grid[j][right] = rotateList.get(counter++);
            }

            for (int i = right - 1; i >= left; i--) {
                grid[bottom][i] = rotateList.get(counter++);
            }

            for (int j = bottom - 1; j > top; j--) {
                grid[j][left] = rotateList.get(counter++);
            }

            list.clear();
            rotateList.clear();

            top++;
            left++;
            bottom--;
            right--;
        }

        return grid;
    }
}