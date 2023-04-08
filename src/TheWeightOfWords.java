import java.util.*;
import java.io.*;

public class TheWeightOfWords {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken()); int w = Integer.parseInt(st.nextToken());
        if(w < l || w > 26 * l) System.out.println("impossible");
        else {
            int num = w / l; int times = w % l;
            for(int i = 0; i < times; i++) System.out.print((char) (num + 'a'));
            for(int i = 0; i < l - times; i++) System.out.print((char) (num - 1 + 'a'));
        }
        br.close();
    }
}