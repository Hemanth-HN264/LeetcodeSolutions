class Solution {
    public int reverse(int x) {
        int rem;
        int rev=0;
        int temp=x;

        if(x<0){
            x=-x;
        }
        while(x>0){
            rem=x%10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
    return 0;
}
            rev=(rev*10)+rem;
            x=x/10;
        }
        if(temp<0){
            rev=-rev;
        }
        return rev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna