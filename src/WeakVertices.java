import java.util.*;
import java.io.*;

public class WeakVertices {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == -1) break;
            boolean[][] adj = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    adj[i][j] = st.nextToken().equals("1");
                }
            }
            boolean[] tri = new boolean[N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        if (i == j || i == k || j == k) continue;
                        if (adj[i][j] && adj[j][k] && adj[k][i]) {
                            tri[i] = tri[j] = tri[k] = true;
                        }
                    }
                }
            }
            for (int i = 0; i < N; i++)
                if (!tri[i])
                    System.out.println(i + " ");
            System.out.println();
        }
        br.close();

    }
}