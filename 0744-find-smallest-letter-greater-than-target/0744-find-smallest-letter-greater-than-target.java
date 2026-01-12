class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // int low = 0, high = letters.length - 1;
        // char ans = letters[0];   

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     if (letters[mid] > target) {
        //         ans = letters[mid];   
        //         high = mid - 1;       
        //     } else {
        //         low = mid + 1;
        //     }
        // }
        // return ans;


        int start=0;
        int last=letters.length-1;
        while(start<=last){
            int mid=start+(last-start)/2;
            if(letters[letters.length-1]<=target){
                return letters[0];
            }
            else if(letters[mid]>target){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start];
    }
}
