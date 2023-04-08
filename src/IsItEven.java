import java.util.*;
import java.io.*;

public class IsItEven {

    private static int vp(int n) {
        int count = 0;
        while((n & 1) == 0) {
            n>>=1; count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int K = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) K -= vp(Integer.parseInt(br.readLine()));
        System.out.println(K <= 0 ? 1 : 0);
        br.close();
    }
}