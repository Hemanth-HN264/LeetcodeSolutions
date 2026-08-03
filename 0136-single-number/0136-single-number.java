class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(Integer i:nums){
            ans=ans^i;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna