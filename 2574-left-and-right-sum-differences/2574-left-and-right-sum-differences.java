class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int totalsum = 0;
        for(int m : nums){
            totalsum+=m;
        }
        int leftsum = 0;
        for(int i=0;i<n;i++){
            int rightsum = totalsum - leftsum - nums[i];
            ans[i]=Math.abs(leftsum - rightsum);
            leftsum+=nums[i];
        }
        return ans;
    }
}