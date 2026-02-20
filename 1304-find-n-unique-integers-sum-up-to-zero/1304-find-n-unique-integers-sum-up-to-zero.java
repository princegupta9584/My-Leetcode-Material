class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = 0;
        
        for(int i = 1; i <= n/2; i++) {
            arr[index++] = i;
            arr[index++] = -i;
        }
        
        // If n is odd, middle element will automatically be 0
        // because array default value is 0
        
        return arr;
    }
}