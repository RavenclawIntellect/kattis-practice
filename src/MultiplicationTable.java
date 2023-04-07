import java.util.*;
import java.io.*;

public class MultiplicationTable {

    public static void main(String[] args) throws IOException{
        //whao so comment
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken()); long M = Long.parseLong(st.nextToken());
        long count = 0;
        for(long i = 1; i <= Math.sqrt(M); i++)
        {
            if(M % i == 0 && i <= N && M / i <= N)
            {
                if(i == M/i) count++;
                else count += 2;
            }
        }
        System.out.println(count);
        br.close();
    }
}