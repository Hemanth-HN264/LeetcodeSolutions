class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int count = h1.getOrDefault(ch, 0);
            count++;
            h1.put(ch, count);
        }

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            int count = h2.getOrDefault(ch, 0);
            count++;
            h2.put(ch, count);
        }

        for(Character ch : h1.keySet()) {

            int count1 = h1.get(ch);
            int count2 = h2.getOrDefault(ch, 0);

            if(count1 - count2 != 0) {
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna