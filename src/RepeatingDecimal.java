import java.util.*;
import java.io.*;
import java.math.*;

public class RepeatingDecimal {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String line = br.readLine();
            if(line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            BigDecimal a = new BigDecimal(st.nextToken()); BigDecimal b = new BigDecimal(st.nextToken()); int c = Integer.parseInt(st.nextToken());
            System.out.println(a.divide(b, c, RoundingMode.DOWN));
        }
        br.close();
    }
}