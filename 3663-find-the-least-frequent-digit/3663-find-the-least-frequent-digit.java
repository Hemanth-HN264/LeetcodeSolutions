class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int x;
        while(n!=0){
            int rem=n%10;
            x=h.getOrDefault(rem,0);
            x++;
            h.put(rem,x);
            n=n/10;
        }
        
        int minFreq = Integer.MAX_VALUE;
        int small = Integer.MAX_VALUE;

        for (Integer i : h.keySet()) {
            int freq = h.get(i);
            if (freq < minFreq || (freq == minFreq && i < small)) {
                minFreq = freq;
                small = i;
            }
        }
        return small;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna