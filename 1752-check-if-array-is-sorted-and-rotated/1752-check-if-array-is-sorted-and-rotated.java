class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        // normal adjacent comparison
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        // last element vs first element
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }
}

