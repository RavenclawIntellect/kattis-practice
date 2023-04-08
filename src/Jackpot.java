import java.util.*;
import java.io.*;

public class Jackpot {

    private static long gcd(long a, long b) {return b == 0 ? a : gcd(b, a%b); }

    private static long lcm(long a, long b) {return a / gcd(a,b) * b;}

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            int w = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long num = 1; boolean works = true;
            for(int i = 0; i < w; i++) {
                num = lcm(num, Long.parseLong(st.nextToken()));
                if(num > 1_000_000_000) {works = false; break;}
            }
            System.out.println(works ? num : "More than a billion.");
        }
        br.close();
    }
}