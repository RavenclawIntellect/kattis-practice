import java.util.*;
import java.io.*;

public class PrimeReduction {

    private static int count = 0;
    private static int red(int N) {
        int count = 0; int num = N;
        for(int i = 2; i <= Math.sqrt(N); i++) {
            while(num % i == 0) {
                count += i; num /= i;
            }
        }
        if(num != 1) count += num;
        return count;
    }

    private static int iter(int N) {
        int next = red(N); count++;
        if(next == N) return N;
        else return iter(next);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int N = Integer.parseInt(br.readLine()); count = 0;
            if(N == 4) break;
            System.out.println(iter(N) + " " + count);
        }
        br.close();
    }
}