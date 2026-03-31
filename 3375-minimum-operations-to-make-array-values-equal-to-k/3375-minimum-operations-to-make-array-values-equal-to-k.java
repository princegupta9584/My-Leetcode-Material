class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> s1=new HashSet<>();
        for(int n:nums){
            if(n<k) return -1;
            if(n>k) s1.add(n);
        }
        return s1.size();
    }
}