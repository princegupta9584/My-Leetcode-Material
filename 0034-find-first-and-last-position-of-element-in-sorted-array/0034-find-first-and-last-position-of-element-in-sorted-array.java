class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int last=nums.length-1;
        int lower=-1;
        int upper=-1;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                lower=mid;
                last=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        } 
        start=0;
        last=nums.length-1;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(nums[mid]==target){
                upper=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        } 
        return new int[]{lower,upper};
    }
}