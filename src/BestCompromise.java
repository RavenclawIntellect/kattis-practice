import java.util.*;
import java.io.*;

public class BestCompromise {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken());
            String[] votes = new String[N];
            for(int i = 0; i < N; i++)
                votes[i] = br.readLine();
            String ans = "";
            for(int i = 0; i < M; i++)
            {
                int count = 0;
                for(int j = 0; j < N; j++)
                    if(votes[j].charAt(i) == '1') count++;
                if(count <= N/2) ans += "0";
                else ans += "1";
            }
            System.out.println(ans);
        }
        br.close();
    }
}