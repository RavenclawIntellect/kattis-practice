import java.util.*;
import java.io.*;

public class IntegerDivision {

    private static long comb(int N) {
        return (long) N * (N - 1) / 2;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int D = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken()) / D;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        long comb = 0;
        for(Map.Entry<Integer, Integer> en : map.entrySet()) {
            comb += comb(en.getValue());
        }
        System.out.println(comb);
        br.close();
    }
}