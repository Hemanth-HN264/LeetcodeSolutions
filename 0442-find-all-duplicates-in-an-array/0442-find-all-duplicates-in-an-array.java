class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> h= new HashMap<>();
        int count=0;
        for(Integer i: nums){
            if(h.containsKey(i)){
                count=h.get(i);
                count++;
                h.put(i,count);
            }else{
                h.put(i,1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int key : h.keySet()) {
            if (h.get(key) >= 2) {
                result.add(key);
            }
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna