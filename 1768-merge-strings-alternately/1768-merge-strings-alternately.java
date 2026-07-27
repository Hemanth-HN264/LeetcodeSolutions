class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String res="";
        int pick=0;
        while(i<word1.length() && j<word2.length()){
            if(pick==0){
                res=res+word1.charAt(i);
                i++;
                pick=1;
            }
            else{
                res=res+word2.charAt(j);
                j++;
                pick=0;
            }
        }
        while(i<word1.length()){
            res=res+word1.charAt(i);
            i++;
        }

        while(j<word2.length()){
            res=res+word2.charAt(j);
            j++;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna