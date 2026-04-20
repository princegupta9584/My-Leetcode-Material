class Solution {
    public String reverseWords(String s) {
       s= s.trim();
       String[] split= s.split("\\s+");
        StringBuilder sc= new StringBuilder();

        for(int i=split.length-1;i>=0;i--){
            sc.append(split[i]);
            if(i!=0){
                sc.append(" ");
            }
        }
        return sc.toString();
    }
}