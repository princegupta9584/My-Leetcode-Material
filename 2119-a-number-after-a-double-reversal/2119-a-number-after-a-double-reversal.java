// class Solution {
//     public boolean isSameAfterReversals(int num) {
//         int reverse = reverse(num);
//         int reverse2 = reverse(reverse);
//         return reverse2 == num;
//     }
//     public int reverse (int n){
//         int reverse = 0;
//         while(n != 0){
//             int last = n%10;
//             if(last != 0){
//                 reverse = reverse * 10 + last;
//             }
//             n/=10;
//         }
//         return reverse;
//     }
// }

class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse1 = reverse(num);
        int reverse2 = reverse(reverse1);

        return reverse2 == num;
    }

    public int reverse(int n) {
        int reverse = 0;

        while (n != 0) {
            int last = n % 10;
            reverse = reverse * 10 + last;
            n /= 10;
        }

        return reverse;
    }
}