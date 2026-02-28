class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int value =1;
        // int pointer =0;
        // int nums[] = new int[k];
        // int pointer2 = 0;
        // while(pointer<arr.length){
        //     if(arr[pointer]==value){
        //         value++;
        //         pointer++;
        //     }
        //     else{
        //         nums[pointer2]=value;
        //         value++;
        //         pointer2++;
        //     }
        // }
        // return nums[k-1];


   
        int value = 1;
        int pointer = 0;
        int nums[] = new int[k];
        int pointer2 = 0;

        while (pointer2 < k) {   // jab tak k missing fill na ho
            if (pointer < arr.length && arr[pointer] == value) {
                pointer++;
            } else {
                nums[pointer2] = value;
                pointer2++;
            }
            value++;
        }

        return nums[k - 1];   // correct index

    }
}