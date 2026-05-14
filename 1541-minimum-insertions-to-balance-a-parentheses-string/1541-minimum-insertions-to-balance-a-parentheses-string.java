class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(ch);
            } else {
                // agar )) pair mila
                if(i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    if(!stack.empty()) {
                        stack.pop();
                    } else {
                        ans += 1; // ek ( insert karna padega
                    }
                    i++; // next ) skip
                } else {
                    // single ) mila
                    if(!stack.empty()) {
                        stack.pop();
                        ans += 1; // ek ) aur chahiye
                    } else {
                        ans += 2; // ek ( aur ek ) chahiye
                    }
                }
            }
        }
        // jo ( bach gaye
        ans += stack.size() * 2;
        return ans;
    }
}