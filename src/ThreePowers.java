import java.util.*;
import java.io.*;
import java.math.*;

public class ThreePowers {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            BigInteger N = new BigInteger(br.readLine()).subtract(BigInteger.ONE);
            if(N.toString().equals("-1")) break;
            BigInteger[] pow = new BigInteger[101];
            for (int i = 0; i <= 100; i++) pow[i] = new BigInteger("3").pow(i);
            StringBuilder bin = new StringBuilder(N.toString(2));
            String s = bin.reverse().toString();
            StringBuilder ans = new StringBuilder("{ ");
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == '1')
                    ans.append(pow[i]).append(", ");
            if (N.toString().equals("0")) System.out.println("{ }");
            else System.out.println(ans.substring(0, ans.length() - 2) + " }");
        }
        br.close();
    }
}