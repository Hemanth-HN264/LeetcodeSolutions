class Solution {
    public int[] concatWithReverse(int[] nums) {
        int j=0;
        int[] ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[j]=nums[i];
            j++;
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[j]=nums[i];
            j++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna