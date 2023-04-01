import java.util.*;
import java.io.*;

public class WhichIsGreater {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(Integer.parseInt(st.nextToken()) > Integer.parseInt(st.nextToken()) ? 1 : 0);
        br.close();
    }
}