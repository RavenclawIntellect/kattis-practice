import java.util.*;
import java.io.*;
import java.math.*;

public class Lamps{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken()); int P = Integer.parseInt(st.nextToken());
        for(int i = 1; i < 8000; i++) {
            double iCost = 60 * i * P / 100000.0 + 5 * Math.ceil(i / 1000.0);
            double lCost = 11 * i * P / 100000.0 + 60;
            if(lCost < iCost) {
                System.out.println((int) Math.ceil((double) i / h));
                return;
            }
        }
        br.close(); out.close();
    }

}