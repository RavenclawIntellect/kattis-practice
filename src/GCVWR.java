import java.util.*;
import java.io.*;

public class GCVWR {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int G = Integer.parseInt(st.nextToken());  int T = Integer.parseInt(st.nextToken()); int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int tot = 0;
        for(int i = 0; i < N; i++) tot += Integer.parseInt(st.nextToken());
        System.out.println((int) ((G - T) * 0.9 - tot));
        br.close();
    }
}