class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        int index = nums.length - 1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                arr[index] = nums[start] * nums[start];
                index--;
                start++;
            } else {
                arr[index] = nums[end] * nums[end];
                index--;
                end--;
            }
        }

        return arr;
    }
}