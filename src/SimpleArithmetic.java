import java.util.*;
import java.io.*;
import java.math.*;

public class SimpleArithmetic {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal a = new BigDecimal(st.nextToken()); BigDecimal b = new BigDecimal(st.nextToken()); BigDecimal c = new BigDecimal(st.nextToken());
        System.out.println(a.multiply(b).divide(c, 8, RoundingMode.HALF_DOWN));
        br.close();
    }
}