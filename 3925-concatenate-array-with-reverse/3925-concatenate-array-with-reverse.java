class Solution {
    public int[] concatWithReverse(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length*2];
        int last = length-1;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[length+i]=nums[last];
            last--;
        }
        return arr;
    }
}