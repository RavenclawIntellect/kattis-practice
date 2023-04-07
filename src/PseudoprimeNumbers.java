import java.util.*;
import java.io.*;
import java.math.*;

public class PseudoprimeNumbers {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger p = new BigInteger(st.nextToken()); BigInteger a = new BigInteger(st.nextToken());
            if(p.equals(BigInteger.ZERO) && a.equals(BigInteger.ZERO)) break;
            System.out.println(!p.isProbablePrime(50) && a.modPow(p, p).equals(a) ? "yes" : "no");
        }
        br.close();
    }
}