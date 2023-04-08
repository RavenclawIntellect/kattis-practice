import java.util.*;
import java.io.*;
import java.math.*;

public class EulersNumber {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal fac = BigDecimal.ONE;
        BigDecimal e = BigDecimal.ZERO;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i <= N; i++) {
            e = e.add(BigDecimal.ONE.divide(fac, 15, RoundingMode.HALF_DOWN));
            fac = fac.multiply(new BigDecimal(Integer.toString(i + 1)));
        }
        System.out.println(e);
        br.close();
    }
}