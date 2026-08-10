class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(Integer i: nums){
            if(h.contains(i)){
                return true;
            }else{
                h.add(i);
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna