import java.util.*;
import java.io.*;

public class PalindromicPassword {

    private static int rev(String s) {
        String num = s + new StringBuilder(s).reverse();
        return Integer.parseInt(num);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            int diff = 1000000; int ans = 0;
            for(int j = 100; j <= 999; j++) {
                int pali = rev(Integer.toString(j));
                if(Math.abs(num - pali) < diff) {
                    diff = Math.abs(num - pali);
                    ans = pali;
                }
            }
            System.out.println(ans);
        }
        br.close();
    }
}