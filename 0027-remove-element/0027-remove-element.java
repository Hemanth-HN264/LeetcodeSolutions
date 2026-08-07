import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        
        // Iterate over values directly
        for (int num : nums) {
            if (num != val) {
                al.add(num);
            }
        }
        
        // Copy back into nums (LeetCode requires in-place modification)
        for (int i = 0; i < al.size(); i++) {
            nums[i] = al.get(i);
        }
        
        // Return new length
        return al.size();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna