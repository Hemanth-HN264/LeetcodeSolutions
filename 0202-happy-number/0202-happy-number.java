class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        int res;
        while(n!=4 && n!=1){
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum=sum+(rem*rem);
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna