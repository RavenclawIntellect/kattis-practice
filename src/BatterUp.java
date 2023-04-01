import java.util.*;
import java.io.*;

public class BatterUp {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0; int tot = 0;
        for(int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            if(num >= 0)
            {
                count++; tot += num;
            }
        }
        System.out.println((double) tot / count);
        br.close();
    }
}