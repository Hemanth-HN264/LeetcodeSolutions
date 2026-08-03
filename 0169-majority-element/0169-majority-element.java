class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        for(Integer i:nums){
            int x=h.getOrDefault(i,0);
            x++;
            h.put(i,x);
        }
        int majority=n/2;
        for(Integer i:h.keySet()){
            if(h.get(i)>majority){
                return i;
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna