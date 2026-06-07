class Solution {
    public int maxProfit(int[] prices) {
        int m = prices[0];
        int res = 0;
        
        for (int i = 1; i < prices.length; i++){
            m = Math.min(m ,prices[i]);
            res = Math.max (res, prices[i] - m);
        }
        
        return res;
    }
}