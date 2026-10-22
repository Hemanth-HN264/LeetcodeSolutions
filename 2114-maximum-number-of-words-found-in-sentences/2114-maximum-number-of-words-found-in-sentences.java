class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxx=0;
        for(int i=0;i<sentences.length;i++){
            String[] str=sentences[i].split(" ");
            if(str.length>maxx){
                maxx=str.length;
            }
        }
        return maxx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna