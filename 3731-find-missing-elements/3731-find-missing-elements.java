class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small){
                small=nums[i];
            }
            if(nums[i]>large){
                large=nums[i];
            }
        }
        HashSet<Integer> h=new HashSet<>();
        for(Integer i:nums){
            h.add(i);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=small;i<=large;i++){
            if(!h.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna