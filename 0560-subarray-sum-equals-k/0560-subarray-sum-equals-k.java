class Solution {
    public int subarraySum(int[] nums, int k) {
        int psum=0;
        int count=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
            if(h.containsKey(psum-k)){
                count+=h.get(psum-k);
            }
            h.put(psum,h.getOrDefault(psum,0)+1);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna