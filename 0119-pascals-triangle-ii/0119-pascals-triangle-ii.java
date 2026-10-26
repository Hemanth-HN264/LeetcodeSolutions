class Solution {

    public int nCr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    }
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int c=0;c<=rowIndex;c++){
            al.add(nCr(rowIndex,c));
        }
        return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna