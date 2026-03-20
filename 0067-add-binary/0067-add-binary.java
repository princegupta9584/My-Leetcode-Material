class Solution {
    public String addBinary(String a, String b) {
        // int x = Integer.parseInt(a,2);
        // int y = Integer.parseInt(b,2);

        // while(y!=0){
        //     int carry=x&y;
        //      x=x^y;
        //     y=carry<<1;
        // }
        // return Integer.toBinaryString(x);

        int x=a.length()-1;
        int y=b.length()-1;
        StringBuilder result = new StringBuilder();
        int carry=0;
        while(x>=0 || y>=0 || carry==1){
            int sum=carry;
            if(x>=0){
                sum=sum+a.charAt(x)- '0';
                x--;
            }
            if(y>=0){
                sum=sum+b.charAt(y)- '0';
                y--;
            }
            result.append(sum % 2);
            carry = sum / 2; 
        }
        return result.reverse().toString();
    }
}