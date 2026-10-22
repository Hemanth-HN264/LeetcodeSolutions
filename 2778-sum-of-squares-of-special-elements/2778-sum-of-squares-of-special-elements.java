class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int ans=0;
        int sq=0;
        for(int i=0;i<nums.length;i++){
            if(n%(i+1)==0){
                sq=nums[i]*nums[i];
                ans=ans+(sq);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna