class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                continue;
            }
            set.add(ch);
            count++;
        }
        return count;
    }
}