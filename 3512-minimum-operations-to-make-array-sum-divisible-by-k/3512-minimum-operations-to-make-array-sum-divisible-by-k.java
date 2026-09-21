class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(Integer i:nums){
            sum=sum+i;
        }
        int count=0;
        while(sum%k!=0){
            sum--;
            count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna