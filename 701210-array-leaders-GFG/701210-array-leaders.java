class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> l = new ArrayList<>();
        int large=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=large){
                large=arr[i];
                l.add(arr[i]);
            }
        }
        Collections.reverse(l);
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna