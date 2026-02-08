class Solution {
    public int partitionDisjoint(int[] nums) {
        int n=nums.length;
        int ans =1;
        int leftmax=nums[0];
        int max = nums[0];

        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            if(nums[i]<leftmax){
                ans=i+1;
                leftmax=max;
            }
        }
        return ans;
    }
}