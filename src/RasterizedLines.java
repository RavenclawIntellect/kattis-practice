import java.io.*;
import java.util.*;

public class RasterizedLines {

    private static ArrayList<Long> primes;
    public static class Pair {
        long a; long b;
        public Pair(long a, long b) {
            this.a = a; this.b = b;
        }
    }
    private static ArrayList<Pair> pFac(long N) {
        long nums = N; ArrayList<Pair> ret = new ArrayList<>();
        for(long i : primes) {
            int count = 0;
            while(nums % i == 0) {
                nums /= i; count++;
            }
            if(count != 0) ret.add(new Pair(i, count));
            if(i > nums) break;
        }
        if(nums != 1) ret.add(new Pair(nums, 1));
        return ret;
    }
    private static ArrayList<Long> fac(long N) {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add((long) 1);
        ArrayList<Pair> pFac = pFac(N);
        for(Pair p : pFac) {
            ArrayList<Long> temp = new ArrayList<>();
            for(int i = 0; i <= p.b; i++) {
                for(long num : nums) {
                    temp.add(num * (long) Math.pow(p.a, i));
                }
            }
            nums.clear(); nums.addAll(temp);
        }
        return nums;
    }

    private static long tot(long N) {
        ArrayList<Pair> facL = pFac(N);
        for(Pair p : facL) N = N / p.a * (p.a - 1);
        return N;
    }

    public static void main(String[] args) throws IOException {
        //Slightly too inefficient bc it is written in Java, achieves 5/8 test cases
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        boolean[] sieve = new boolean[10_000_001];
        primes = new ArrayList<>();
        sieve[1] = true;
        for(int i = 2; i <= 10_000_000; i++) {
            if(!sieve[i]) {
                for(int j = 2 * i; j <= 10_000_000; j += i) sieve[j] = true;
                primes.add((long) i);
            }
        }
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            long num = Long.parseLong(br.readLine());
            ArrayList<Long> divs = fac(num);
            long tot = 0;
            for(long N : divs) tot += tot(N + 1);
            out.println(tot);
        }
        out.close();
    }
}
