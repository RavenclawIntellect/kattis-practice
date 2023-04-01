import java.util.*;
import java.io.*;

public class JackOLanternJuxtaposition {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long count = 1;
        while(st.hasMoreTokens()) count *= Integer.parseInt(st.nextToken());
        System.out.println(count);
        br.close();
    }
}