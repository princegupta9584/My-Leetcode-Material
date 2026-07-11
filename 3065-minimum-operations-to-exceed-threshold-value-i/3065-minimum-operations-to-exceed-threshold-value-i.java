class Solution {
    public int minOperations(int[] nums, int k) {
        int i = 0;
        int count = 0;
        while(i<nums.length){
            if(nums[i] < k){
                nums[i] = Integer.MAX_VALUE;
                i=0;
                count++;
                continue;
            }
            i++;
        }
        return count;
    }
}