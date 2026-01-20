class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // important step
            int rem = columnNumber % 26;
            sb.insert(0, (char) ('A' + rem));
            columnNumber = columnNumber / 26;
        }

        return sb.toString();
    }
}
