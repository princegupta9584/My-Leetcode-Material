class Solution {
    public int maxProduct(int n) {
        String s = n+"";
        int arr[] = new int[s.length()];
        int j =0;
        while(n!=0){
            arr[j]=n%10;
            j++;
            n/=10;
        }
        int len = arr.length;
        Arrays.sort(arr);
        int maxone = arr[0]*arr[1];
        int maxtwo = arr[len-1] * arr[len-2];
        return maxone > maxtwo ? maxone : maxtwo;
    }
}