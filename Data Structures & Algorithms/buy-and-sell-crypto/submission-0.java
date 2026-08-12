class Solution {
    public int maxProfit(int[] prices) {
        int cost = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<cost){
                cost=prices[i];
            }else{
                int currProfit = prices[i]-cost;
                maxProfit = Math.max(maxProfit,currProfit);
            }
        }
        return maxProfit;
    }
}
