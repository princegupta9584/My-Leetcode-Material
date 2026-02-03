class Solution {
    public int findDuplicate(int[] nums) {
        //apply cyclic sort
        int i=0;
        while(i<nums.length){
            //number is not present the our correct index
            if(nums[i]!=i+1){
                //currect index = i-1 beacuse the starting is 1toN
                int correct=nums[i]-1;
                //after number is not present is our correct index then check the correct index is alredy present the correct index or not 
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }else{
                    //it is a duplicate element
                    return nums[i];
                } 
            }else{
                i++;
            }
        }
        return -1;
    }

    void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}