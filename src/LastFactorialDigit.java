import java.util.*;
import java.io.*;

public class LastFactorialDigit {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(--T >= 0)
        {
            int N = Integer.parseInt(br.readLine());
            if(N == 1) System.out.println(1);
            else if(N == 2) System.out.println(2);
            else if(N == 3) System.out.println(6);
            else if(N == 4) System.out.println(4);
            else System.out.println(0);
        }
        br.close();
    }
}