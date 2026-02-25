class Solution {
    public boolean isValid(String s) {
        String sc="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                sc+=s.charAt(i);
            }
            else{
                if(sc.length() == 0) return false;
                if((s.charAt(i)=='}') && (sc.charAt(sc.length()-1)=='{') || (s.charAt(i)==']') && (sc.charAt(sc.length()-1)=='[') || (s.charAt(i)==')') && (sc.charAt(sc.length()-1)=='(')){
                    sc = sc.substring(0, sc.length() - 1);
                }
                else{
                    return false;
                }
            }
        }
        return sc.length()==0;
    }
}