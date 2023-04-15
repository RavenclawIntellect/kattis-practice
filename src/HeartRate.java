import java.util.*;
import java.io.*;
import java.math.*;

public class HeartRate{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken()); double p = Double.parseDouble(st.nextToken());
            double b1 = (b - 1) / p * 60;
            double b2 = b / p * 60;
            double b3 = (b + 1) / p * 60;
            out.println(b1 + " " + b2 + " " + b3);
        }
        br.close(); out.close();
    }

}