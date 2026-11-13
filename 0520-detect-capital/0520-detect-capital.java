class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCase=0;
        char[] ch=word.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                upperCase++;
            }
        }
        return upperCase==word.length() || upperCase==0 || (upperCase==1 && Character.isUpperCase(word.charAt(0)));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna