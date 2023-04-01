import java.util.*;
import java.io.*;

public class JumboJavelin {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); int count = 0;
        for(int i = 0; i < N; i++) count += Integer.parseInt(br.readLine());
        System.out.println(count - N + 1);
        br.close();
    }
}
