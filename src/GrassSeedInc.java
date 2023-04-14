import java.util.*;
import java.io.*;
import java.math.*;

public class GrassSeedInc{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        double C = Double.parseDouble(br.readLine()); int L = Integer.parseInt(br.readLine());
        double area = 0;
        for(int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            area += Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken());
        }
        System.out.println(C * area);
        br.close(); out.close();
    }

}