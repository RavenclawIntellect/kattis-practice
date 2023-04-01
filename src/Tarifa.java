import java.util.*;
import java.io.*;

public class Tarifa {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine()); int N = Integer.parseInt(br.readLine()); int sum = 0;
        for(int i = 0; i < N; i++) sum += Integer.parseInt(br.readLine());
        System.out.println((N + 1) * X - sum);
        br.close();
    }
}