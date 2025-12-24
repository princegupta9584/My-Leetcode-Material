class Solution {
    public boolean rotateString(String s, String goal) {
   //int n=s.length()-1;
       // for(int i=0;i<s.length();i++){
        if(s.length()!=goal.length()) return false;
           String sb = s+s;
           if(sb.contains(goal)){
            return true;
           }   
       // }
        return false;
    }
}
