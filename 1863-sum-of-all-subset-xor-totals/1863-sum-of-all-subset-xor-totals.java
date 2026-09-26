class Solution {
    public int subsetXORSum(int[] nums) {
        return find(nums, 0, 0);
    }
    public int find(int[] nums, int index, int xor) {
        if (index == nums.length) {
            return xor;
        }
        int include = find(nums, index + 1, xor ^ nums[index]);
        int exclude = find(nums, index + 1, xor);
        return include + exclude;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna