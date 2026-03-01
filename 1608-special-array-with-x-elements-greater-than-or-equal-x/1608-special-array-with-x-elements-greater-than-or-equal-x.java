import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            int x = n - i;
            
            if(nums[i] >= x && (i == 0 || nums[i - 1] < x)) {
                return x;
            }
        }
        
        return -1;

        
        // int n = nums.length;
        // for (int x = 1; x <= n; x++) {
        //     int count = 0;
        //     for (int i = 0; i < n; i++) {
        //         if (nums[i] >= x) {
        //             count++;
        //         }
        //     }
        //     if (count == x) {
        //         return x;
        //     }
        // }
        // return -1;
    }
}