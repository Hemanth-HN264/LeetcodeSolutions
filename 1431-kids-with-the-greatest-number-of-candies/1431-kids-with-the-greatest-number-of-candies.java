class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int large=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>large){
                large=candies[i];
            }
        }
        ArrayList<Boolean> l=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=large){
                l.add(true);
            }else{
                l.add(false);
            }
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna