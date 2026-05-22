class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i, temp, pivot = -1;
        
        for(i = n-2; i >= 0; i--) {
            if (arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }
        
        if (pivot == -1) {
            rev(arr, 0, n-1);
            return;
        }
        
        for(i = n-1; i > pivot; i--) {
            if (arr[pivot] < arr[i]) {
                temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        
        rev(arr, pivot + 1, n - 1);
    }
    
    public static void rev (int[] a, int s, int e) {
        int temp;
        while (s < e) {
            temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
}