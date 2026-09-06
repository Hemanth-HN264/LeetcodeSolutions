class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();

        for(Integer i:nums1){
            h1.add(i);
        }
        for(Integer i:nums2){
            h2.add(i);
        }
        int[] res=new int[h1.size()];
        int index=0;
        for(Integer i:h1){
            if(h2.contains(i)){
                res[index]=i;
                index++;
            }
        }
        
        int[] result=new int[index];
        for(int i=0;i<result.length;i++){
            result[i]=res[i];
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna