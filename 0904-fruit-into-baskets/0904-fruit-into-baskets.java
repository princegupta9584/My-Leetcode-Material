class Solution {
    public int totalFruit(int[] fruits) {
        int k=2;
        int l=0;
        int r=0;
        int maxlen=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>k){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.getOrDefault(fruits[l],0)==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            if(map.size()<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}