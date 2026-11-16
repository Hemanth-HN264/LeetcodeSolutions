class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        char[] ch=s.toCharArray();
        int maxLen=0;
        for(int i=0;i<n;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=i;j<n;j++){
                if(h.contains(ch[j])){
                    h.clear();
                    break;
                }
                int len=j-i+1;
                maxLen=Math.max(len,maxLen);
                h.add(ch[j]);
            }
        }
        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna