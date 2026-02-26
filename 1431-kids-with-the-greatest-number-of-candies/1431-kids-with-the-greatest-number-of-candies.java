class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandy=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>maxcandy){
                maxcandy=candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= maxcandy){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}