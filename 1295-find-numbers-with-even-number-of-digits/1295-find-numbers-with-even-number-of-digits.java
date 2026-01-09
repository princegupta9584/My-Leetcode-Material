class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(digit(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }

    //number check the number is even or not
    int digit(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}