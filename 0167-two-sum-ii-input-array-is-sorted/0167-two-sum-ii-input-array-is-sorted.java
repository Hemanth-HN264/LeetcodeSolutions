class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i,j;
        int n=numbers.length;
        for(i=0;i<=n-1;i++){
            for(j=i+1;j<=n-1;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[] {i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna