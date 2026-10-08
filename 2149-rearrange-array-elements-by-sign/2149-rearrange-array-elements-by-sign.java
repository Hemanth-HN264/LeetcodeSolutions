class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int pos=0; int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos=pos+2;
            }else{
                ans[neg]=nums[i];
                neg=neg+2;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna