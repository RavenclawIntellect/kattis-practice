import java.util.*;
import java.io.*;

public class Dominoes2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken()); int L = Integer.parseInt(st.nextToken());
            ArrayList<ArrayList<Integer>> con = new ArrayList<>();
            for(int i = 0; i < N; i++) con.add(new ArrayList<>());
            for(int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                con.get(Integer.parseInt(st.nextToken()) - 1).add(Integer.parseInt(st.nextToken()) - 1);
            }
            Queue<Integer> bfs = new LinkedList<>();
            boolean[] vis = new boolean[N]; int count = 0;
            for(int i = 0; i < L; i++) bfs.add(Integer.parseInt(br.readLine()) - 1);
            while(!bfs.isEmpty()) {
                int node = bfs.poll();
                if(vis[node]) continue;
                count++; vis[node] = true;
                for(int n : con.get(node)) {
                    if(!vis[n]) bfs.add(n);
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}