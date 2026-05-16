class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> stacka = new Stack<>();
        Stack<Character> stackb = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='a'){
                stacka.push(ch);
            }else{
                stackb.push(ch);
            }
        }
        int ans = 0;
        if(stacka.size()>stackb.size()){
            ans = stacka.size()-stackb.size();
        }
        if(stackb.size()>stacka.size()){
            ans = stackb.size()-stacka.size();
        }
        return ans;
    }
}