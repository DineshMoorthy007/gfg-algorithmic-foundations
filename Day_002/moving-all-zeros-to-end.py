class Solution:
    def pushZerosToEnd(self, arr):
        c = 0
         
        for num in arr:
            if num != 0:
                arr[c] = num
                c += 1
        
        while c < len(arr) :
            arr[c] = 0
            c += 1
    	    
        # Alternative approach :
        # for num in arr :
        #     if num != 0 :
        #         num, arr[c] = arr[c], num
        #         c += 1