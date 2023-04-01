import java.util.*;
import java.io.*;

public class AlienNumbers {

    public static long toDec(String num, String src)
    {
        int base = src.length();
        long[] pow = new long[num.length()];
        long c = 1;
        for(int i = 0; i < pow.length; i++) {
            pow[i] = c; c *= base;
        }
        long sum = 0;
        for(int i = 0; i < num.length(); i++) {
            long dig = 0;
            for(int j = 0; j < src.length(); j++)
            {
                if(num.charAt(i) == src.charAt(j)) dig = j;
            }
            sum += dig * pow[num.length() - i - 1];
        }
        return sum;
    }

    public static String fromDec(long num, String tar)
    {
        long run = num;
        int base = tar.length();
        if(num < base) return String.valueOf(tar.charAt((int) num));
        return fromDec(num / base, tar) + tar.charAt((int) (num % base));
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        int cur = 0;
        while(cur++ < testcase)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num = st.nextToken(); String src = st.nextToken(); String tar = st.nextToken();
            System.out.printf("Case #%d: %s%n", cur, fromDec(toDec(num, src), tar));
        }
        br.close();
    }
}
