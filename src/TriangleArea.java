import java.util.*;
import java.io.*;

public class TriangleArea {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println((double) Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) / 2);
        br.close();
    }
}