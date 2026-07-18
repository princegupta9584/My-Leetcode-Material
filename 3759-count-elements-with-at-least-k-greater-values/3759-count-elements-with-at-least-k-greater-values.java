class Solution {
    public int countElements(int[] nums, int k) {
        if(nums.length <=k) return 0;
        Arrays.sort(nums);
        int count = 0;
        for(int num : nums){
            int idx = firstgreater(nums, num);
            int greater = nums.length - idx;
            if(greater>=k){
                count++;
            }
        }
        return count;
    }

    public int firstgreater(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left<right){
            int mid = left + (right - left)/2;
            if(arr[mid]<= target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}