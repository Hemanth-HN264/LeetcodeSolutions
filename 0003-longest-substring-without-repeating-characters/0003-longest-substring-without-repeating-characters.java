class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0,r=0,maxLen=0;
        char[] ch=s.toCharArray();
        HashMap<Character,Integer>h=new HashMap<>();
        while(r<n){
            if(h.containsKey(ch[r]) && h.get(ch[r])>=l){
                l=h.get(ch[r])+1;
            }
            h.put(ch[r],r);
            int length=r-l+1;
            maxLen = Math.max(maxLen, length);
            r++;
        }
        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna