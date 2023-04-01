import java.util.*;
import java.io.*;

public class Stopwatch {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N % 2 == 1) System.out.println("still running");
        else
        {
            long sum = 0;
            for(int i = 0; i < N / 2; i++)
                sum += -1 * Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
            System.out.println(sum);
        }
        br.close();
    }
}