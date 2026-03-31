class Solution {
    public int maximumPossibleSize(int[] nums) {
        int prev=0;
        int ans=0;
        for(int num:nums){
            if(num>=prev){
                prev=num;
                ans++;
            }
        }
        return ans;
    }
}