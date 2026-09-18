class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        for(int i=0;i<n;i++){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna