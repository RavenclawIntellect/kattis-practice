import java.util.*;
import java.io.*;

public class Bijele {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < 6; i++)
            System.out.print(p[i] - Integer.parseInt(st.nextToken()) + " ");
        br.close();
    }
}