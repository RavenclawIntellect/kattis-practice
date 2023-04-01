import java.util.*;
import java.io.*;

public class ChanukahChallenge {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); int t = 0;
        while(++t <= T)
        {
            int N = Integer.parseInt(br.readLine().split(" ")[1]);
            System.out.println(t + " " + N * (N + 3) / 2);
        }
        br.close();
    }
}