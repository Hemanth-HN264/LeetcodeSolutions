class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=0;i<=r;i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        while(r<nums.length-1){
            sum-=nums[l];
            l++;
            r++;
            sum+=nums[r];
            maxSum=Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna