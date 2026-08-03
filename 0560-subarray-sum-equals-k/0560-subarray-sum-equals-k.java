class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();

        h.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (h.containsKey(sum - k)) {
                count += h.get(sum - k);
            }

            h.put(sum, h.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna