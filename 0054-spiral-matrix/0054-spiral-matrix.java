class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0, right=m-1, top=0, bottom=n-1;
        ArrayList<Integer> a=new ArrayList<>();

        while(top<=bottom && left<=right){
             // Right
        for(int i=left;i<=right;i++){
            a.add(matrix[top][i]);
        }
        top++;

        //Bottom
        for(int i=top;i<=bottom;i++){
            a.add(matrix[i][right]);
        }
        right--;

        //Left
        if(top<=bottom){
            for(int i=right;i>=left;i--){
            a.add(matrix[bottom][i]);
        }
        bottom--;
        }
        
        //Top
        if(left<=right){
            for(int i=bottom;i>=top;i--){
            a.add(matrix[i][left]);
        }
        left++;
        }
        } 
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna