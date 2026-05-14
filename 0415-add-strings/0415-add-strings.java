class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while(i>=0 || j>=0 || carry!=0){
            int one = 0;
            int two = 0;

            if(i>=0){
                one = num1.charAt(i) - '0';
                i--;
            }

            if(j>=0){
                two = num2.charAt(j) - '0';
                j--;
            }

            int num = one + two + carry;
            int last = num % 10;
            carry = num/10;
            sb.append(last);
        }
        return sb.reverse().toString();
    }
}