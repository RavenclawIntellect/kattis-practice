import java.util.*;
import java.io.*;
import java.math.*;

public class BeautifulPrimes {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        BigInteger tot = BigInteger.ONE; int min = 0;
        for(int j = 1; j <= 1000; j++) {
            ArrayList<Integer> primes = new ArrayList<>(lists.get(j - 1));
            primes.add(7); tot = tot.multiply(new BigInteger("7"));
            while(tot.toString().length() < j) {
                primes.set(min, 11); tot = tot.divide(new BigInteger("7")).multiply(new BigInteger("11"));
                min++;
            }
            lists.add(primes);
        }
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            ArrayList<Integer> primes = lists.get(Integer.parseInt(br.readLine()));
            for(int i : primes) System.out.print(i + " ");
            System.out.println();
        }
        br.close();
    }
}