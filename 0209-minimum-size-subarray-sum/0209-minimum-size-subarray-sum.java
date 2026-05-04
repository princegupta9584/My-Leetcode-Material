class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int length=Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                length=Math.min(length,r-l+1);
                sum-=nums[l];
                l++;
            }
            // length=Math.min(length,r-l+1);?
            r++;
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}