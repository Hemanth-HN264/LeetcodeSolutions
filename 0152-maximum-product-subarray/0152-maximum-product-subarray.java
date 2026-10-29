class Solution {
    public int maxProduct(int[] nums) {
        int maxx=Integer.MIN_VALUE;
        int pref=1;
        int suff=1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(pref==0){
                pref=1;
            }
            if(suff==0){
                suff=1;
            }
            pref=pref*nums[i];
            suff=suff*nums[n-i-1];
          maxx=Math.max(maxx,Math.max(pref,suff));
        }
        return maxx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna