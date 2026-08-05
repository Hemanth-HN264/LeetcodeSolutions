class Solution {
    public int lengthOfLongestSubstring(String s) {
         int tempCount=0;
         int i,j;
         char[] ch=s.toCharArray();
         int count=0;
         HashMap<Character,Integer> h= new HashMap<>();
         for (i = 0; i < ch.length; i++) {

    h.clear();      // Start fresh for every i
    count = 0;

    for (j = i; j < ch.length; j++) {
        if (h.containsKey(ch[j])) {
            break;
        }
        h.put(ch[j], 1);   
        count++;
    }
    if (count > tempCount) {
        tempCount = count;
    }
}
         return tempCount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna