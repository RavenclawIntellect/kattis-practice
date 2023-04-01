import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TemperatureConfusion {

    public static class frac {
        public long a, b;
        public frac(long a, long b)
        {
            this.a = a; this.b = b;
        }

        public long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        public frac simplify()
        {
            long gcd = gcd(a,b);
            long pA = a/gcd; long pB = b/gcd;
            if(pB < 0) {
                pA *= -1; pB *= -1;
            }
            return new frac(pA, pB);
        }

        public frac add(frac f)
        {
            return (new frac(a * f.b + b * f.a, b * f.b)).simplify();
        }

        public frac mult(frac f)
        {
            return (new frac(a * f.a, b * f.b)).simplify();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String frac = br.readLine();
        StringTokenizer st  = new StringTokenizer(frac, "/");
        int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken());
        frac num = new frac(a,b);
        frac res = num.add(new frac(-32, 1)).mult(new frac(5, 9));
        System.out.println(res.a + "/" + res.b);
    }
}
