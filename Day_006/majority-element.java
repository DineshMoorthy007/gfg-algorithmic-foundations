import java.util.*;

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int l = arr.length;
        int e1 = -1, e2 = -1, c1 = 0, c2 = 0;
        
        for (int num : arr) {
            if (num == e1){
                c1 += 1;
            }
            else if (num == e2) {
                c2 += 1;
            }
            else if (c1 == 0) {
                e1 = num;
                c1 += 1;
            }
            else if (c2 == 0) {
                e2 = num;
                c2 += 1;
            }
            else {
                c1--;
                c2--;
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        int ct1 = 0, ct2 = 0;
        
        for (int num : arr) {
            if (e1 == num) {
                ct1++;
            }
            else if (e2 == num) {
                ct2++;
            }
        }
        
        if (ct1 > l/3){
            res.add(e1);
        }
        
        if (ct2 > l/3 && e1 != e2) {
            res.add(e2);
        }
        
        Collections.sort(res);
        return (res);
    }
}