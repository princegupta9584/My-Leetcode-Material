class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // STEP 1: find pivot
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }

        if(i >= 0) {
            // STEP 2: find just greater element
            int j = n - 1;
            while(nums[j] <= nums[i]) {
                j--;
            }

            // STEP 3: swap
            swap(nums, i, j);
        }

        // STEP 4: reverse right part
        reverse(nums, i+1, n-1);
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void reverse(int[] a, int l, int r) {
        while(l < r) {
            swap(a, l++, r--);
        }
    }
}
