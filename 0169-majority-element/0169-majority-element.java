class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count++;
                el=nums[i];
            }
            else if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return el;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna