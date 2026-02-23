import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
        int sumA = 0;
        int sumB = 0;
        
        // Calculate sum of A
        for (int a : A) {
            sumA += a;
        }
        
        // Calculate sum of B
        for (int b : B) {
            sumB += b;
        }
        
        int d = (sumA - sumB) / 2;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0, j = 0;
        
        while (i < A.length && j < B.length) {
            int diff = A[i] - B[j];
            
            if (diff == d) {
                return new int[]{A[i], B[j]};
            }
            
            if (diff < d) {
                i++;
            } else {
                j++;
            }
        }
        
        return new int[]{-1, -1};
    }
}