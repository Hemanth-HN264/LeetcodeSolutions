class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h =new HashMap<>();
        int count=0;
        for(Integer i:nums){
            if(h.containsKey(i)){
                count=h.get(i);
                count++;
                h.put(i,count);
            }else{
                h.put(i,1);
            }
        }
        for(Integer i:h.keySet()){
            if(h.get(i)>(nums.length/2)){
                return i;
            }
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna