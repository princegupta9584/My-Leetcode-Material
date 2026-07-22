class Solution {
    public void sortColors(int[] nums) {
        //Dutch national flag algorithm
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }



        //********** This is a better approach but space complexity is incresed */
        // we can create a count array


        // int largest=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     largest=Math.max(largest,nums[i]);
        // }
        // int count[]=new int[largest+1];
        // for(int i=0;i<nums.length;i++){
        //     count[nums[i]]++;
        // }
        // int j=0;
        // for(int i=0;i<count.length;i++){
        //     while (count[i] > 0) {
        //     nums[j]=i;
        //     j++;
        //     count[i]--;
        //     }
        // }
    }
}