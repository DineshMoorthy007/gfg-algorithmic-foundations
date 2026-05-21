class Solution:
    def rotateArr(self, arr, d):
        n = len(arr)
        
        d %= n
        
        rev(arr, 0, d-1)
        
        rev(arr, d, n-1)
        
        rev(arr, 0, n-1)
    
def rev(arr,s,e) :
    
    while s < e :
        arr[s],arr[e] = arr[e],arr[s]
        s += 1
        e -= 1