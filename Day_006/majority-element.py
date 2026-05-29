class Solution:
    def findMajority(self, arr):
        l = len(arr)
        e1 ,e2 ,c1 ,c2 = -1 ,-1 ,0 ,0
        
        for num in arr :
            if num == e1:
                c1 += 1
            
            elif num == e2:
                c2 += 1
                
            elif c1 == 0:
                e1 = num
                c1 += 1
                
            elif c2 == 0:
                e2 = num
                c2 += 1
                
            else :
                c1 -= 1;
                c2 -= 1;
                
        res = []
        ct1 ,ct2 = 0 ,0
        
        for n in arr :
            if n == e1:
                ct1 += 1
            
            if n == e2:
                ct2 += 1
                
        if (ct1 > l/3):
            res.append(e1)
            
        if (ct2 > l/3):
            res.append(e2)
            
        res.sort()
        return res