import java.util.*;
import java.io.*;

public class Oddities {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(N % 2 == 0 ? N + " is even" : N + " is odd");
        }
        br.close();
    }
}