class Solution {
    public void moveZeroes(int[] nums) {
        int i;
        int left=0;
        for(i=0;i<=nums.length-1;i++){
                if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna