import java.util.*;
import java.io.*;

public class Graduation {

    static ArrayList<ArrayList<Integer>> con;
    static boolean[] visited;

    private static void dfs(int node) {
        visited[node] = true;
        for(int i : con.get(node)) {
            if(!visited[i])
                dfs(i);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken()); int K = Integer.parseInt(st.nextToken());
        int[][] grid = new int[N][M];
        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                grid[i][j] = line.charAt(j) - 'A';
            }
        }
        con = new ArrayList<>();
        for(int i = 0; i < K; i++) con.add(new ArrayList<>());
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N - 1; j++) {
                int n1 = grid[j][i]; int n2 = grid[j+1][i];
                con.get(n1).add(n2); con.get(n2).add(n1);
            }
        }
        visited = new boolean[K]; int count = 0;
        for(int i = 0; i < K; i++) {
            if(visited[i]) continue;
            count++; dfs(i);
        }
        System.out.println(count);
        br.close();
    }
}