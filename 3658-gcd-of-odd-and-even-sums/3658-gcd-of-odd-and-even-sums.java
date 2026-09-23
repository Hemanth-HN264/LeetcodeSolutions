class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum1=0;
        int sum2=0;
        int series=1;
        n=n*2;
        while(n>0){
            if(series%2!=0){
                sum1=sum1+series;
                series++;
                n--;
            }else{
                sum2=sum2+series;
                series++;
                n--;
            }
        }
        int small=sum1;
        if(sum1>sum2){
            small=sum2;
        }
        int gcd=0;
        for(int i=1;i<=small;i++){
            if(sum1%i==0 && sum2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna