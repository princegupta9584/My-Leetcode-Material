class Solution {
    public String sortSentence(String s) {
        
        String[] ch = s.split(" ");
        String[] result = new String[ch.length];

        for (int i = 0; i < ch.length; i++) {
            
            String word = ch[i];   // current word
            
            char lastChar = word.charAt(word.length() - 1);
            int index = lastChar - '0';
            
            String actualWord = word.substring(0, word.length() - 1);
            
            result[index - 1] = actualWord;
        }

        String ans = "";

        for (int i = 0; i < result.length; i++) {
            ans += result[i];
            if (i != result.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
}