class Solution {
    public int compress(char[] chars) {
        String ans = "";
        int count = 1;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                ans = ans + chars[i];
                if (count > 1) {
                    ans = ans + count;
                }
                count = 1;
            }
        }

        ans = ans + chars[chars.length - 1];
        if (count > 1) {
            ans = ans + count;
        }

        char[] anss = ans.toCharArray();
        for (int i = 0; i < anss.length; i++) {
            chars[i] = anss[i];
        }

        return anss.length;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna