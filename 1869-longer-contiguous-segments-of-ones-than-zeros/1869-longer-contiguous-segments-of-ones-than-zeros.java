class Solution {
    public boolean checkZeroOnes(String s) {
        int count1 = 0,
         count0 = 0;
        int max1 = 0,
         max0 = 0;
        while (s.length() > 0) {
            char last = s.charAt(s.length() - 1);
            if (last == '1') {
                count1++;
                count0 = 0;
                max1 = Math.max(max1, count1);
            } else {
                count0++;
                count1 = 0;
                max0 = Math.max(max0, count0);
            }
            s = s.substring(0, s.length() - 1); // delete last char
        }
        return max1 > max0;
    }
}
