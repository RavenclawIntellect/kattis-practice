import java.util.*;
import java.io.*;

public class EstimatingTheAreaofACircle {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double r = Double.parseDouble(st.nextToken());
            if(r == 0) break;
            int c = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            double area = Math.PI * r * r;
            double calcArea = 4 * r * r * m / c;
            System.out.println(area + " " + calcArea);
        }
        br.close();
    }
}
