class Solution:
    def nextPermutation(self, arr):
        n = len(arr)
        pivot = -1
        
        for i in range (n - 2, -1, -1) :
            if (arr[i] < arr[i+1]) :
                pivot = i
                break
        
        if pivot == -1:
            arr.reverse()
            return
        
        for i in range (n - 1, pivot, -1) :
            if (arr[pivot] < arr[i]) :
                arr[pivot], arr[i] = arr[i], arr[pivot]
                break
        
        s = pivot + 1;
        e = n - 1;
        
        while (s < e) :
            arr[s], arr[e] = arr[e], arr[s]
            s += 1
            e -= 1