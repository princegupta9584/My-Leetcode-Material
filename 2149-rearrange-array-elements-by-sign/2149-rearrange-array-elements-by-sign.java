class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 1;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[k] = nums[i];
                k = k + 2;
            } else {
                arr[j] = nums[i];
                j = j + 2;
            }
        }
        return arr;
    }
}