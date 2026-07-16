class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        int resultSum = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);

                // Agar current sum target ke aur close hai
                if (diff < minDiff) {
                    minDiff = diff;
                    resultSum = sum;
                }

                // Exact target mil gaya
                if (sum == target) {
                    return sum;
                }
                // Sum chhota hai -> left badhao
                else if (sum < target) {
                    left++;
                }
                // Sum bada hai -> right ghatao
                else {
                    right--;
                }
            }
        }

        return resultSum;
    }
}