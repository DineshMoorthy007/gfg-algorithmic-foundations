class Solution:
    def getSecondLargest(self, arr):
        if len(arr) < 2:
            return -1
            
        a = b = -1
        
        for num in arr :
            if num > a :
                b = a
                a = num
            elif (b < num and a != num) :
                b = num
        
        return b