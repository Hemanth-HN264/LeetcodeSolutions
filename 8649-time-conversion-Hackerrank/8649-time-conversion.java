import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String amOrPm=s.substring(s.length()-2);
    String hour=s.substring(0, 2);
    int hrs=Integer.parseInt(hour);
    if(amOrPm.equals("PM") && hrs!=12){
        hrs=hrs+12; 
        return hrs+s.substring(2,s.length()-2);
    }
    if(amOrPm.equals("AM") && hrs==12){
        return "00"+s.substring(2,s.length()-2);
    }
    if(amOrPm.equals("AM") && hrs!=12){
        return s.substring(0,s.length()-2);
    }
    return s.substring(0,s.length()-2);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna