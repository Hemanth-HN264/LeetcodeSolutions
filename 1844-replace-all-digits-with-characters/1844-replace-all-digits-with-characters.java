class Solution {
    public String replaceDigits(String s) {
        char[] str=s.toCharArray();
        for (int i=1;i<str.length;i+=2) {
            int temp=str[i]-'0';
            str[i]=(char)(str[i-1]+temp);
        }
        return new String(str);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna