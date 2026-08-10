class Solution {
    static int countDistinct(int arr[]) {
        // code here
        HashSet<Integer> h= new HashSet<>();
        for(Integer i: arr){
            h.add(i);
        }
        return h.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna