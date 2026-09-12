class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxx = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            if (profit > maxx) {
                maxx = profit;
            }
        }
        return maxx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna