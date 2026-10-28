class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> h=new HashSet<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            h.add(ch[i]);
        }
        return h.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna