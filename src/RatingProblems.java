import java.util.*;
import java.io.*;
import java.math.*;

public class RatingProblems {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int K = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i = 0; i < K; i++) count += Integer.parseInt(br.readLine());
        out.print((double) (count - 3 * (N - K)) / N);
        out.print(" " + (double) (count + 3 * (N - K)) / N);
        br.close(); out.close();
    }

}