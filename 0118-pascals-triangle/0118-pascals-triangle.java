class Solution {
    public List<Integer> generateRow(int n){
        ArrayList<Integer> al=new ArrayList<>();
        long ans=1;
        al.add((int)ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            al.add((int)ans);
        }
        return al;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna