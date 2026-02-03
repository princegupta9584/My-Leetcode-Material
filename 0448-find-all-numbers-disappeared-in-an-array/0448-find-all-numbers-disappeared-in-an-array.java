class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //apply cyclic sort 
        int i=0;
        while(i<nums.length){
            int currect=nums[i]-1;
            if(nums[i]!=nums[currect]){
                swap(nums,i,currect);
            }else{
                i++;
            }
        }

        //find missing number in list
        List<Integer>ans= new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}