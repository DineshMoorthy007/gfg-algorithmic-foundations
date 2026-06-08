import java.util.Arrays;

class Solution {
    public int getMinDiff(int[] arr, int k) {
        int m, mh, l = arr.length;
        Arrays.sort(arr);
        int res = arr[l-1] - arr[0];
        
        for(int i = 1; i < l; i++){
            if (arr[i] - k < 0){
                continue;
            }
            m = Math.min(arr[0] + k, arr[i] - k);
            mh = Math.max(arr[i-1] + k, arr[l-1] - k);
            res = Math.min(res, mh - m);
        }
        
        return res;
    }
}