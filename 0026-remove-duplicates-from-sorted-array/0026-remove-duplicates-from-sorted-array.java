class Solution {
    public int removeDuplicates(int[] nums) {
       LinkedHashSet<Integer> h=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        int index=0;
        for(Integer i: h){
            nums[index]=i;
            index++;
        }
       return h.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna