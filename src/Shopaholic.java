import java.util.*;
import java.io.*;

public class Shopaholic {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> prices = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            prices.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(prices, Collections.reverseOrder());
        long tot = 0;
        for(int i = 2; i < N; i += 3) tot += prices.get(i);
        System.out.println(tot);
        br.close();
    }
}