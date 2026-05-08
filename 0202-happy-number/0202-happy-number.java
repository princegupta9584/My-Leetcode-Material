class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = squarefind(slow);
            fast = squarefind(squarefind(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int squarefind(int number){
        int ans = 0;
        while(number > 0){
            int last = number % 10;
            ans += last * last;
            number = number/10;
        }
        return ans;
    }
}