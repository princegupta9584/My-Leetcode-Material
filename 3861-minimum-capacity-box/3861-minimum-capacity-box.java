class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minimum_capacity = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                if(minimum_capacity>capacity[i]){
                    minimum_capacity = capacity[i];
                    index = i;
                }
            }
        }
        return index;
    }
}