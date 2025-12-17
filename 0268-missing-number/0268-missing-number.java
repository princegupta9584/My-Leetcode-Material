class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
       Arrays.sort(nums);
      if(nums[0]!=0){
        return 0;
          }
     
      for(int i=0;i<n-1;i++){
        if (nums[i+1] - nums[i] == 2){
            return nums[i]+1;
        }
      } 
      return nums[n-1]+1; 

    // Arrays.sort(nums);
    // if(nums[0]!=0){
    //     return 0;
    // }
    // int j=0;
    // for(int i=0;i<nums.length;i++){
    //     if(nums[i]!=j){
    //         return j;
    //     }
    //     j++;
    // }
    // return j;
    }
}