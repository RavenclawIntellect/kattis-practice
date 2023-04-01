import java.util.*;
import java.io.*;

public class Filip {

    public static int read(StringTokenizer st) throws IOException
    {
        return Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(Math.max(read(st), read(st)));
        br.close();
    }
}