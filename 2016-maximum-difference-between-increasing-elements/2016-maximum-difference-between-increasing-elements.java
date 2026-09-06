class Solution {
    public int maximumDifference(int[] nums) {
        int diff=0;
        int maxx=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    diff=nums[j]-nums[i];
                }
                if(diff>maxx){
                    maxx=diff;
                }
            }
        }
        if(maxx == 0) {
        return -1;
}
        return maxx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna