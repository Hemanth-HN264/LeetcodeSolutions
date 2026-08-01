class Solution {
    public int maxSubArray(int[] nums) {
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        int maxx=nums[0];
        for(int i=1;i<=dp.length-1;i++){
            dp[i]=Math.max((dp[i-1]+nums[i]),nums[i]);
            maxx=Math.max(maxx,dp[i]);
        }
        return maxx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna