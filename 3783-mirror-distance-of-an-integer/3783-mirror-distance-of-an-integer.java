class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        return Math.abs(rev-n);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna