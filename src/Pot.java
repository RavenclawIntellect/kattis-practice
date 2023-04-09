import java.util.*;
import java.io.*;

public class Pot {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); int tot = 0;
        for(int i = 0; i < N; i++) {
            String l = br.readLine();
            tot += (int) Math.pow(Integer.parseInt(l.substring(0, l.length() - 1)), Integer.parseInt(l.substring(l.length() - 1)));
        }
        System.out.println(tot);
        br.close();
    }
}