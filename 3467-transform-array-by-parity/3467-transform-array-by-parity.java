class Solution {
    public int[] transformArray(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=nums[i]^nums[j];
                nums[j]=nums[i]^nums[j];
                nums[i]=nums[i]^nums[j];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna