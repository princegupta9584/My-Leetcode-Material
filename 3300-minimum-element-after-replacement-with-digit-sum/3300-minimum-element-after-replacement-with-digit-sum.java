class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            int value = sumofDigit(num);
            min=Math.min(min, value);
        }
        return min;
    }

    public int sumofDigit(int num){
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans+=rem;
            num=num/10;
        }
        return ans;
    }
}