import java.util.*;
import java.io.*;
import java.math.*;

public class DiceCup{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int one = Integer.parseInt(st.nextToken()); int two = Integer.parseInt(st.nextToken());
        for(int i = Math.min(one, two) + 1; i <= Math.max(one, two) + 1; i++) out.println(i);
        br.close(); out.close();
    }

}