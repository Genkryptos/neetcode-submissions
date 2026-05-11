class Solution {
    public int maxProfit(int[] prices) {
       if(prices.length<=1)
            return 0;
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for(int i = 1;i<prices.length;i++){
            int profit = prices[i]-lowestPrice;
            maxProfit = Math.max(maxProfit,profit);
            if(profit<0){
                lowestPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
