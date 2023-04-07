import java.util.*;
import java.io.*;

public class Pet {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0; int num = 0;
        for(int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            while(st.hasMoreTokens()) count += Integer.parseInt(st.nextToken());
            if(count > max) {
                num = i; max = count;
            }
        }
        System.out.println(num + 1 + " " + max);
        br.close();
    }
}