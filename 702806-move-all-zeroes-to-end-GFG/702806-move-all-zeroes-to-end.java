class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i;
        int left=0;
        for(i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna