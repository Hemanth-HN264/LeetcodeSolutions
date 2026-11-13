class Solution {
    public int sumOfUnique(int[] nums) {
        int[] ans=new int[100];
        for(int i=0;i<nums.length;i++){
           ans[nums[i]-1]++;
        }
        int sum=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]==1){
                sum=sum+(i+1);
            }
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna