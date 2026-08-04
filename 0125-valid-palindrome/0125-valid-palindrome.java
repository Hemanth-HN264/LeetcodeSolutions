class Solution {
    public boolean isPalindrome(String s) {
        char[] a=s.toCharArray();
        int i;
        String ans="";
        for(i=0;i<=a.length-1;i++){
            if(a[i]>=65 && a[i]<=90){
                a[i]=(char)(a[i]+' ');
                ans=ans+a[i];
            }
            else if(a[i]>=97 && a[i]<=122){
                ans=ans+a[i];
            }
            else if(a[i]>=48 && a[i]<=57){
                ans=ans+a[i];
            }
            else if(a[i]==32){ 
            }
            else{  
            }
        }

        boolean flag= true;
        char[] c=ans.toCharArray();
        i=0;
        int j=c.length-1;
        while(i<j){
            if(c[i]!=c[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna