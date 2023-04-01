import java.util.*;
import java.io.*;

public class Autori {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        String s = "";
        while(st.hasMoreTokens()) s += st.nextToken().charAt(0);
        System.out.println(s);
        br.close();
    }

}