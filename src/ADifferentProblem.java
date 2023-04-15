import java.util.*;
import java.io.*;
import java.math.*;

public class ADifferentProblem{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        while(true) {
            String line = br.readLine();
            if(line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            System.out.println(Math.abs(Long.parseLong(st.nextToken()) - Long.parseLong(st.nextToken())));
        }
        br.close(); out.close();
    }

}