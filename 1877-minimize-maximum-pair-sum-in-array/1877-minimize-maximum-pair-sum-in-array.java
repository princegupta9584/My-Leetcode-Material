import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int maxSum = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int pairSum = nums[i] + nums[j];
            maxSum = Math.max(maxSum, pairSum);
            i++;
            j--;
        }
        return maxSum;
    }
}
