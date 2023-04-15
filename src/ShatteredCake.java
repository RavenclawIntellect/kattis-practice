import java.util.*;
import java.io.*;
import java.math.*;

public class ShatteredCake {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int W = Integer.parseInt(br.readLine()); int N = Integer.parseInt(br.readLine());
        int area = 0;
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            area += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        out.println(area / W);
        br.close(); out.close();
    }

}