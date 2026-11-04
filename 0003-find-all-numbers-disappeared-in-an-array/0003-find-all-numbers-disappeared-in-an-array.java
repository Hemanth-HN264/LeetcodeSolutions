class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int [] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[nums[i]-1]=nums[i];
        }
       List<Integer> l=new ArrayList<>();
        for(int i=0;i<res.length;i++){
            if(res[i]==0){
                l.add(i+1);
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna