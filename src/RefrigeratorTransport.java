import java.util.*;
import java.io.*;

public class RefrigeratorTransport {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pA = Integer.parseInt(st.nextToken()); int cA = Integer.parseInt(st.nextToken());
        int pB = Integer.parseInt(st.nextToken()); int cB = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int minC = Integer.MAX_VALUE; int aT = 0; int bT = 0;
        for(int i = 0; i <= Math.ceil((double) N / cA); i++) {
            int move = Math.min(N, i * cA); int cost = pA * i;
            cost += pB * (int) Math.ceil((double) (N - move) / cB);
            if(cost < minC) {
                minC = cost;
                aT = i; bT = (int) Math.ceil((double) (N - move) / cB);
            }
        }
        System.out.println(aT + " " + bT + " " + minC);
        br.close();
    }
}