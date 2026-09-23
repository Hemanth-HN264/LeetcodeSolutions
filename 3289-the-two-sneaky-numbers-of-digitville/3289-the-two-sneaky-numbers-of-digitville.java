class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> h=new HashMap<>();
        for(Integer i:nums){
            int x=h.getOrDefault(i,0);
            x++;
            h.put(i,x);
        }

        int[] res=new int[2];
        int r=0;
        for(Integer i:h.keySet()){
            if(h.get(i)>1){
                res[r]=i;
                r++;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna