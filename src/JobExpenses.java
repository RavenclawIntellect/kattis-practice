import java.util.*;
import java.io.*;

public class JobExpenses {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long e = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(x < 0) e += -1 * x;
        }

        System.out.println(e);
        br.close();
    }
}