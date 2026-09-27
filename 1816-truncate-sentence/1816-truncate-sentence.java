class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
             ans += str[i];
             if(i<k-1){
                ans+=" ";
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna