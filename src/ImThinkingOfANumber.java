import java.util.*;
import java.io.*;

public class ImThinkingOfANumber {

    private static long gcd(long a, long b) {return b == 0 ? a : gcd(b, a % b); }

    private static long lcm(long a, long b) {return a * b / gcd(a, b); }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        while(true)
        {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            long min = 1; long max = -1; long div = 1;
            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String com = st.nextToken(); st.nextToken(); int num = Integer.parseInt(st.nextToken());
                if(com.equals("greater")) min = Math.max(min, num + 1);
                else if(com.equals("divisible")) div = lcm(div, num);
                else {
                    if(max == -1) max = num - 1;
                    else max = Math.min(max, num - 1);
                }
            }
            if(max == -1) { out.println("infinite"); continue; }
            long minD = (long) Math.ceil((double) min / div); long maxD = (long) (Math.floor((double) max / div));
            if(maxD < minD) out.println("none");
            else {
                for(long fac = minD; fac <= maxD; fac++) out.print(fac * div + " ");
                out.println();
            }
        }
        br.close();
        out.close();
    }
}