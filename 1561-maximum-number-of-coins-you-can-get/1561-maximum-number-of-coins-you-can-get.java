class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans=0;
        int i=0;
        int j=piles.length-2;
        while (i<j) {
            ans += piles[j];
            i++;
            j-=2;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna