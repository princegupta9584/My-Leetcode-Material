class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int current=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            //profit
            int sell=prices[i];
            if(buy<sell){
                profit=sell-buy;
                if(current<profit){
                    current=profit;
                }
            }
            //loss
            else{
                buy=sell;
            }
        }
        return current;
    }
}