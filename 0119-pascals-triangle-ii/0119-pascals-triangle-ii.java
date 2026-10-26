class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> al=new ArrayList<>();
        long ans=1;
        al.add((int)ans);
        for(int i=0;i<rowIndex;i++){
            ans=ans*(rowIndex-i);
            ans=ans/(i+1);
            al.add((int)ans);
        }
        return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna