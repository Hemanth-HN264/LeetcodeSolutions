class Solution {
    public int alternatingSum(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i%2!=0){
                ans=ans-nums[i];
            }else{
                ans=ans+nums[i];
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna