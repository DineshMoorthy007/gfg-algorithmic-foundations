class Solution:
    def maxProfit(self, prices) -> int:
        res = 0
        
        for i in range(1, len(prices)) :
            if prices[i] > prices[i-1] :
                res = res + (prices[i] - prices[i-1])
                
        return res