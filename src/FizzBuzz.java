import java.util.*;
import java.io.*;
import java.math.*;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken()); int Y = Integer.parseInt(st.nextToken()); int N = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++) {
            if(i % X == 0) out.print("Fizz");
            if(i % Y == 0) out.print("Buzz");
            if(i % X != 0 && i % Y != 0) out.print(i);
            out.println();
        }
        br.close(); out.close();
    }

}