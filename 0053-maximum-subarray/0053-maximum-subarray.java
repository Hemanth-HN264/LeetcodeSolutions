class Solution {
    public int maxSubArray(int[] nums) {
        int pSum=0;
        int maxSub=nums[0];
        for(int i:nums){
            pSum=Math.max(pSum+i,i);
            maxSub=Math.max(pSum,maxSub);
        }
        return maxSub;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna