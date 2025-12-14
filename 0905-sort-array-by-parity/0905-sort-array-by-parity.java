class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //Arrays.sort(nums);
        int j=0;
        int k=nums.length-1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if((nums[i]%2)==0){
                //int temp=nums[j];
                arr[j]=nums[i];
                //nums[i]=temp;
                j++;
            }
            else{
                // int temp=nums[k];
                arr[k]=nums[i];
                //nums[i]=temp;
                k--;
            }
        }
        return arr;
    }
}

// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int i = 0, j = nums.length - 1;

//         while (i < j) {
//             if (nums[i] % 2 > nums[j] % 2) {
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//             }
//             if (nums[i] % 2 == 0) i++;
//             if (nums[j] % 2 == 1) j--;
//         }
//         return nums;
//     }
// }
