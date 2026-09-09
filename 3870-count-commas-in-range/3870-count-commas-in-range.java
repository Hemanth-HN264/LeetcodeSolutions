class Solution {
    public int countCommas(int n) {
        int count=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        if(count>3){
            return n-999;
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna