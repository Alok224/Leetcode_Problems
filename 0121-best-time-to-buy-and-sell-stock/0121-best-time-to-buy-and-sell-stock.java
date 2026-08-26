class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; int maxprofit = 0; int buyprice = Integer.MAX_VALUE;
        boolean flag = true;
        for(int i = 0; i<n; i++){
            buyprice = Math.min(prices[i],buyprice);        
            maxprofit = Math.max(maxprofit,prices[i] - buyprice);
        }
        return maxprofit;
    }
}