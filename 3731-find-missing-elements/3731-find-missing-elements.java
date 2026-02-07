import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);   // Binary search logic ke liye sorted hona zaroori

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {

            int prev = nums[i - 1];
            int curr = nums[i];

            // agar gap hai
            while (prev + 1 < curr) {
                ans.add(prev + 1);
                prev++;
            }
        }

        return ans;
    }
}
