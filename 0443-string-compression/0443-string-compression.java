class Solution {
    public int compress(char[] chars) {
        int index = 0; 
        int i = 0;    
        while (i < chars.length) {
            char curr = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == curr) {
                i++;
                count++;
            }
            chars[index++] = curr;
            if (count > 1) {
                String countStr = Integer.toString(count); 
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        return index; 
    }
}