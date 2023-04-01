import java.util.*;
import java.io.*;

public class WelcomeToCodeJamEasy {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        int T = 0 ;
        while(++T <= testcases)
        {
            String line = br.readLine();
            String des = "welcome to code jam";
            int[][] dp = new int[line.length() + 1][des.length() + 1];
            for(int i = 0; i <= line.length(); i++)
                dp[i][0] = 1;
            for(int i = 1; i <= des.length(); i++) {
                for(int j = 1; j <= line.length(); j++) {
                    int sum = dp[j-1][i];
                    if(des.charAt(i-1) == line.charAt(j-1)) sum = (sum + dp[j-1][i-1]) % 10000;
                    dp[j][i] = sum;
                }
            }
            System.out.println("Case #" + T + ": " + String.format("%04d", dp[line.length()][des.length()]));
        }
        br.close();
    }
}