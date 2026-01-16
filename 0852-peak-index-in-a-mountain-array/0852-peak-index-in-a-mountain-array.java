class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //it means you are in an decresing part
            if(arr[mid]>arr[mid+1]){
                //this may be a answer but look like a left side
                end=mid;
            }
            //it means you are in the increasinmg part
            else {
                // look like a right side
                start=mid+1;
            }
            // else{
            //     return mid;
            // }
        }
        return start;
    }
    // static int binarysearch(int arr[]){
    //     int start=0;
    //     int end=arr.length;
    //     while(start<=end){
    //         int mid=start+(end-start)/2;
    //         if(arr[mid]>arr[mid+1]){
    //             //check left side 
    //             end=mid-1;
    //         }
    //         else if(arr[mid]<arr[mid+1]){
    //             start=mid+1;
    //         }
    //         else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }
}