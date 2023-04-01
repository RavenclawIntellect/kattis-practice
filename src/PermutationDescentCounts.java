import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PermutationDescentCounts {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TESTCASES = Integer.parseInt(br.readLine());
        int MOD = 1001113;
        for(int CASE = 1; CASE <= TESTCASES; CASE++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken()); int v = Integer.parseInt(st.nextToken());
            int[][] dp = new int[N + 1][v + 1];
            dp[1][0] = 1;
            for(int i = 2; i <= N; i++)
            {
                for(int j = 0; j <= v; j++)
                {
                    if(j == 0) dp[i][j] = dp[i-1][j];
                    else dp[i][j] = ((dp[i-1][j] * (j + 1)) % MOD + (dp[i-1][j-1] * (i - j)) % MOD) % MOD;
                }
            }
            System.out.println(CASE + " " + dp[N][v]);
        }
    }
}
