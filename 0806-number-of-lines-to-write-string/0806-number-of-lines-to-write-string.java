class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentwidth = 0;
        for(int i=0;i<s.length();i++){
            int width = widths[s.charAt(i)-'a'];
            if(currentwidth + width <= 100){
                currentwidth += width;
            }else{
                lines++;
                currentwidth = width;
            }
        }
        return new int[]{lines, currentwidth};
    }
}