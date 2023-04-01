import java.util.*;
import java.io.*;

public class Challenge {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int K = Integer.parseInt(st.nextToken()); int R = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] dna = new int[N];
        for(int i = 0; i < N; i++)
            dna[i] = Integer.parseInt(st.nextToken());
        int[] min = new int[K];
        for(int i = 0; i < R; i++)
        {
            st = new StringTokenizer(br.readLine());
            min[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        int[] tot = new int[K]; ArrayList<ArrayList<Integer>> pos = new ArrayList<>();
        for(int i = 0; i < K; i++)
            pos.add(new ArrayList<>());
        for(ArrayList<Integer> list : pos) list.add(N - 1);
        for(int i = N - 1; i >= 0; i--)
        {
            int num = dna[i];
            tot[num]++;
            pos.get(num).add(i);
        }
        int[] runCount = new int[N];
        int r = N;
        for(int i = 0; i < K; i++)
        {
            if(tot[i] < min[i]) {
                System.out.println("impossible");
                return;
            }
            runCount[i] = tot[i] - min[i];
        }
        for(int i = 1; i <= N; i++)
        {

        }
    }
}
