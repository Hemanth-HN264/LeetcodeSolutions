import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i:nums){
            if(h.containsKey(i)){
                count=h.get(i);
                count++;
                h.put(i,count);
            }else{
                h.put(i,1);
            }
        }
        if(count>1){
            return true;
        }else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna