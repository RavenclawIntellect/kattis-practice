import java.util.*;

public class Alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] dp = new int[s.length() + 1]; dp[1] = 1;
        for(int i = 2; i <= s.length(); i++)
        {
            int max = 1;
            for(int j = 1; j < i; j++)
            {
                if(s.charAt(j - 1) < s.charAt(i - 1))
                    max = Math.max(max, dp[j] + 1);
            }
            dp[i] = max;
        }
        int max = 0;
        for(int num : dp) max = Math.max(num, max);
        System.out.println(26 - max);
    }
}
