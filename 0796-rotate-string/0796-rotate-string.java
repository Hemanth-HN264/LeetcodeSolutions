class Solution {
    public boolean rotateString(String s, String goal) {
        // Lengths must match
        if (s.length() != goal.length()) {
            return false;
        }

        int n = s.length();
        // Try all possible rotations
        for (int i = 0; i < n; i++) {
            boolean match = true;
            for (int j = 0; j < n; j++) {
                // Compare character by character after rotation
                if (s.charAt((i + j) % n) != goal.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna