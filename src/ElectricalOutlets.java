import java.util.*;
import java.io.*;
import java.math.*;

public class ElectricalOutlets{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = -(Integer.parseInt(st.nextToken()) - 1);
            while(st.hasMoreTokens()) count += Integer.parseInt(st.nextToken());
            out.println(count);
        }
        br.close(); out.close();
    }

}