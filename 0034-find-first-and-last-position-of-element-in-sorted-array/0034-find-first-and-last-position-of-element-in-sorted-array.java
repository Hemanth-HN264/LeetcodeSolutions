class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0; int j=nums.length-1;
        int[] ans={-1,-1};
        int mid;
        while(i<=j){
            mid=(i+j)/2;
            if(target==nums[mid]){
                ans[0]=mid;
                j=mid-1;
            }
            else if(target>nums[mid]){
                i=mid+1;
            }
            else if(target<nums[mid]){
                j=mid-1;
            }
        }
         i=0;  j=nums.length-1;
        while(i<=j){
            mid=(i+j)/2;
            if(target==nums[mid]){
                ans[1]=mid;
                i=mid+1;
            }
            else if(target>nums[mid]){
                i=mid+1;
            }
            else if(target<nums[mid]){
                j=mid-1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna