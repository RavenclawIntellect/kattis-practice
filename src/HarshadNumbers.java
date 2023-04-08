import java.util.*;
import java.io.*;

public class HarshadNumbers {

    private static boolean check(int N) {
        String s = Integer.toString(N);
        int count = 0;
        for(int i = 0; i < s.length(); i++) count += s.charAt(i) - '0';
        return N % count == 0;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        while(true) {
            if(check(num)) {
                System.out.println(num); break;
            }
            num++;
        }
        br.close();
    }
}