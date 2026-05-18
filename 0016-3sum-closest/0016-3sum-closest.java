class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum) < Math.abs(target - closest)){
                    closest = sum;
                }
                if(sum == target){
                    return sum;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return closest;
    }
}

// *************************** Brute Force ****************************
// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         int closest = nums[0]+nums[1]+nums[2];
//         for(int i =0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 for(int k =j+1;k<nums.length;k++){
//                     int sum = nums[i]+nums[j]+nums[k];
//                     // int close = Math.abs(target-ans);
//                     if(Math.abs(target-sum) < Math.abs(target-closest)){
//                         closest=sum;
//                     }
//                 }
//             }
//         }
//         return closest;
//     }
// }