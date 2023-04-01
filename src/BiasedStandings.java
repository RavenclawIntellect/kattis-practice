import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BiasedStandings {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        while(--cases >= 0)
        {
            br.readLine();
            int N = Integer.parseInt(br.readLine());
            int[] teams = new int[N];
            for(int i = 0; i < N; i++)
            {
                teams[i] = Integer.parseInt(br.readLine().split(" ")[1]);
            }
            Arrays.sort(teams);
            long bad = 0;
            for(int i = 0; i < N; i++)
                bad += Math.abs(teams[i] - (i + 1));
            System.out.println(bad);
        }
    }
}
