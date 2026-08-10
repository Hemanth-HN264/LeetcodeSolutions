class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        for(Integer i: nums1){
            h1.add(i);
        }

        HashSet<Integer> h2=new HashSet<>();
        for(Integer i: nums2){
            if(h1.contains(i)){
                h2.add(i);
            }
        }

        int[] ar=new int[h2.size()];
        int idx = 0;
        for (int num : h2) {
            ar[idx++] = num;
        }
        return ar;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna