class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rSum=0, lSum=0;
        int maxSum=0;
        for(int i=0;i<=k-1;i++){
            lSum+=cardPoints[i];
        }
        maxSum=lSum;
        int rInd=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[rInd];
            rInd--;
            maxSum=Math.max(maxSum,(lSum+rSum));
        }
        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna