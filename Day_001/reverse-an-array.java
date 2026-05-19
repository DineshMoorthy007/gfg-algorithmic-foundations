class Solution {
    public void reverseArray(int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        int temp;
        
        while (l < r){
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            l++;
            r--;
        }
    }
}