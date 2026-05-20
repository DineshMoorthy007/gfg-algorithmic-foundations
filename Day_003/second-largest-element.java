class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2){
            return -1;
        }
        
        int a = -1;
        int b = -1;
        
        for (int i = 0; i < arr.length; i++){
            if (a < arr[i]){
                b = a;
                a = arr[i];
            }
            else {
                if (b < arr[i] && a != arr[i]){
                    b = arr[i];
                }
            }
        }
        
        return b;
    }
}