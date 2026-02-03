class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        //serach
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }

     void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


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
    // }



}