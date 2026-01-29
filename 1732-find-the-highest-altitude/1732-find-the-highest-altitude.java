class Solution {
    public int largestAltitude(int[] gain) {
        int value=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            value=value+gain[i];
            max=Math.max(max,value);
        }
        return max;
    }
}