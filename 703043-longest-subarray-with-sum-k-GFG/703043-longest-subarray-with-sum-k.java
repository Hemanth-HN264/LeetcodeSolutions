class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Long, Integer> h = new HashMap<>();
        long sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            long rem=sum-k;
            if(h.containsKey(rem)){
                int len=i-h.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!h.containsKey(sum)){
                h.put(sum,i);
            }
            
        }
        return maxLen;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna