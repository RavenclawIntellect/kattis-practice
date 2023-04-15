import java.util.*;
import java.io.*;
import java.math.*;

public class NastyHacks{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken()); int n2 = Integer.parseInt(st.nextToken()); int n3 = Integer.parseInt(st.nextToken());
            if(n1 > n2 - n3) out.println("do not advertise");
            else if(n1 == n2 - n3) out.println("does not matter");
            else out.println("advertise");
        }
        br.close(); out.close();
    }

}