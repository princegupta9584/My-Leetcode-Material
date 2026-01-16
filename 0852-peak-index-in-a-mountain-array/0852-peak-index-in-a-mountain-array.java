class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //check left side 
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                return mid;
            }
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