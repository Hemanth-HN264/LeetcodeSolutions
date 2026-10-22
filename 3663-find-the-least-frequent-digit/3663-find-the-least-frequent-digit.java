class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq=new int[10];
        while(n!=0){
            int rem=n%10;
            freq[rem]+=1;
            n=n/10;
        }
        int res=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                if(freq[i]<min){
                res=i;
                min=freq[i];
                }   
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna