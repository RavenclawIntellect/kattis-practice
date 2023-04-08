import java.util.*;
import java.io.*;

public class HowManyDigits {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] logs = new double[1000001];
        double log = 0;
        for(int i = 1; i <= 1000000; i++) {
            log += Math.log10(i);
            logs[i] = log;
        }
        while(true) {
            String s = br.readLine();
            if(s == null) break;
            int N = Integer.parseInt(s);
            System.out.println((int) logs[N] + 1);
        }
        br.close();
    }
}