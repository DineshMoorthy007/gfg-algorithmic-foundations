class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        
        // if (d > n)
        // {
        //     d = d%n;
        // }
        
        d = d%n;
        
        rev(arr, 0, d-1);
        
        rev(arr, d, n-1);
        
        rev(arr, 0, n-1);
        
    }
    
    public static void rev (int a[], int s, int e) {
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