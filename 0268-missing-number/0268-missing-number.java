class Solution {
    public int missingNumber(int[] nums) {
        
        int total=0;
        for(int i=0; i<=nums.length;i++){
            total=total+i;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        return total-sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna