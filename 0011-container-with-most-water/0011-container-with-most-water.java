class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;

        while(i<j){
            int l=Math.min(height[i],height[j]);
            int b=j-i;
            int area=l*b;
            ans=Math.max(ans,area);
            if(height[i] <= height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}