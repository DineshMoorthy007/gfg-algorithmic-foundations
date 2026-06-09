class Solution:
    def maxSubarraySum(self, arr):
        a ,b = arr[0], arr[0]
        
        for i in range (1 ,len(arr)):
            a = max(arr[i], arr[i] + a)
            b = max(a,b)
            
        return b