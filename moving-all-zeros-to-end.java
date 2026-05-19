class Solution {
    void pushZerosToEnd(int[] arr) {
        int temp, c = 0;
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
                c++;
            }
        }
    }
}