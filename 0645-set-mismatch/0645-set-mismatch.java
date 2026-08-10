class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> h= new HashSet<>();
        int dupl=0;
        int n=nums.length;
        for(Integer i: nums){
            if(h.contains(i)){
                dupl=i;
            }
            else{
                h.add(i);
            }
        }
        int miss=0;
        for(int i=1;i<=n;i++){
            if(! h.contains(i)){
                miss=i;
            }
        }
        return new int[]{dupl,miss};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna