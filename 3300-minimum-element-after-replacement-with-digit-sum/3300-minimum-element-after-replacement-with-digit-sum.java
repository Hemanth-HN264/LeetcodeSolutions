class Solution {
    public int minElement(int[] nums) {
        int sum=0;
        int rem=0;
        int n=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=0;
            rem=0;
            n=nums[i];
            while(n>0){
                rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            nums[i]=sum;
            if(sum<min){
                min=sum;
            }
        }
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna