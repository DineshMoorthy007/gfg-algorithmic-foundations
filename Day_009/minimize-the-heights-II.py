class Solution:
    def getMinDiff(self, arr, k):
        l = len(arr)
        arr.sort()
        
        res = arr[l-1] - arr[0];
        
        for i in range(1, l):
            if (arr[i] - k < 0) :
                continue
            
            m = min(arr[0] + k, arr[i] - k)
            mh = max(arr[i-1] + k, arr[l-1] - k)
            res = min (res, mh - m)
            
        return res