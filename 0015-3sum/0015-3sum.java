class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> h=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(h1.contains(-(nums[i]+nums[j])) ){
                    List<Integer> l=new ArrayList<>(List.of(nums[i],nums[j], -(nums[i]+nums[j])));
                    Collections.sort(l);
                    h.add(l);
                }
                h1.add(nums[j]);
            }
            h1.clear();
        }
        return new ArrayList<>(h);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna