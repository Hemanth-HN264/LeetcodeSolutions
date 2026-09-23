class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> h=new HashMap<>();
        for(Integer i:nums){
            int x=h.getOrDefault(i,0);
            x++;
            h.put(i,x);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(Integer i:h.keySet()){
            if(h.get(i)>1){
                l.add(i);
            }
        }

        int[] res=new int[l.size()];
        int r=0;
        for(Integer i:l){
            res[r]=i;
            r++;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna