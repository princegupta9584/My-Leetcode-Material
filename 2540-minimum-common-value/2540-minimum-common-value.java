class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l=0;
        int r=0;

        while(r<nums1.length && l<nums2.length){
            if(nums1[r]==nums2[l]){
                return nums1[r];
            }
            else if(nums1[r]<nums2[l]){
                r++;
            }
            else{
                l++;
            }
        }

        return -1;
    }
}