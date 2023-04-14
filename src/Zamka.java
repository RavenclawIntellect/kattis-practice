import java.util.*;
import java.io.*;
import java.math.*;

public class Zamka {

    private static int sum(int N) {
        String s = Integer.toString(N);
        int sum = 0;
        for(int i = 0; i < s.length(); i++) sum += s.charAt(i) - '0';
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int L = Integer.parseInt(br.readLine()); int D = Integer.parseInt(br.readLine()); int X = Integer.parseInt(br.readLine());
        int min = D; int max = L;
        for(int i = L; i <= D; i++) {
            if(sum(i) == X) {
                min = Math.min(min, i); max = Math.max(max, i);
            }
        }
        out.println(min); out.println(max);
        br.close(); out.close();
    }

}