class Solution {
    int maxSubarraySum(int[] arr) {
        int s = arr[0] ,e =  arr[0];
        
        for (int i = 1; i < arr.length; i++){
            s = Math.max(arr[i], arr[i] + s);
            e = Math.max(s,e);
        }
        
        return e;
    }
}
