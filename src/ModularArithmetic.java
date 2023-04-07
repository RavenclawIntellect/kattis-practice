import java.io.*;
import java.util.*;
import java.math.*;

public class ModularArithmetic {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger N = new BigInteger(st.nextToken()); int t = Integer.parseInt(st.nextToken());
            if(N.equals(BigInteger.ZERO) && t == 0) break;
            while(--t >= 0)
            {
                st = new StringTokenizer(br.readLine());
                BigInteger n1 = new BigInteger(st.nextToken()); char op = st.nextToken().charAt(0); BigInteger n2 = new BigInteger(st.nextToken());
                if(op == '+') System.out.println((n1.add(n2)).mod(N));
                else if(op == '-') System.out.println((n1.subtract(n2)).mod(N));
                else if(op == '*') System.out.println((n1.multiply(n2)).mod(N));
                else {
                    if(!n2.gcd(N).equals(BigInteger.ONE)) System.out.println(-1);
                    else {
                        System.out.println((n1.multiply(n2.modInverse(N))).mod(N));
                    }
                }
            }
        }
        br.close();
    }
}