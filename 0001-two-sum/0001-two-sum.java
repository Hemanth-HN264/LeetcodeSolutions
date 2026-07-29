import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h =new HashMap<> ();
        int index=0;
        for(int i:nums){
            int compliment=target-i;
            if(h.containsKey(compliment)){
                return new int[] { h.get(compliment), index };
            }
            h.put(i,index);
            index++;
        }
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna