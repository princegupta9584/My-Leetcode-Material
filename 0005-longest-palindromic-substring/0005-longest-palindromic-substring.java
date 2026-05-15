class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        // String even = "";
        // String odd = "";

        for(int i=0;i<s.length();i++){
            String odd = palindrome(s,i,i);
            String even = palindrome(s,i,i+1);
            if(odd.length()>ans.length()){
                ans = odd;
            }
            if(even.length()>ans.length()){
                ans = even;
            }
        }
        return ans;
    }

    public String palindrome(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
                start--;
                end++;
        }
        return s.substring(start+1,end);
    }
}



//******************************* Brute Force ******************************** */
// public String longestPalindrome(String s) {
//         String ans = "";
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 if(palindrome(s, i, j)){
//                      if((j - i + 1) > ans.length()) {
//                         ans = s.substring(i, j + 1);
//                     }
//                 }
//             }
//         }
//         return ans;
//     }

//     public boolean palindrome(String s, int start, int end){

//         while(start<end){
//             if(s.charAt(start)!=(s.charAt(end))){
//                 return false;
//             }
//             start++;
//             end--;
//         }
//         return true;
//     }