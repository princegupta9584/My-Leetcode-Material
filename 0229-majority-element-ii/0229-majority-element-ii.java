import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int size = n / 3;

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                // check previous element
                if (count > size && !list.contains(nums[i - 1])) {
                    list.add(nums[i - 1]);
                }
                count = 1; // reset for new element
            }
        }

        // last element check
        if (count > size && !list.contains(nums[n - 1])) {
            list.add(nums[n - 1]);
        }

        return list;
    }
}