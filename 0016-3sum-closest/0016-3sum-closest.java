class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int closest = nums[0]+nums[1]+nums[2];
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k =j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    // int close = Math.abs(target-ans);
                    if(Math.abs(target-sum) < Math.abs(target-closest)){
                        closest=sum;
                    }
                }
            }
        }
        return closest;
    }
}