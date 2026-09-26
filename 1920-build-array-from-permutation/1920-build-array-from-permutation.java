class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            j=nums[i];
            ans[i]=nums[j];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna