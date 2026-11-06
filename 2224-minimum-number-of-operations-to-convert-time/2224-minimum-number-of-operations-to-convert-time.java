class Solution {
    public int convertTime(String current, String correct) {
        int cuH=Integer.parseInt(current.substring(0,2));
        int cuM=Integer.parseInt(current.substring(3));
        int coH=Integer.parseInt(correct.substring(0,2));
        int coM=Integer.parseInt(correct.substring(3));
        int count=0;
        int dif=0;
        if(coM<cuM){
            coH-=1;
            dif=coM+(60-cuM);
        }else{
            dif=coM-cuM;
        }
        if(coH-cuH!=0){
            count=coH-cuH;
        }
        while(dif>=15){
            dif-=15;
            count++;
        }
        while(dif>=5){
            dif-=5;
            count++;
        }
        while(dif>=1){
            dif-=1;
            count++;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna