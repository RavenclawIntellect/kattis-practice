import java.io.*;
import java.util.StringTokenizer;

public class QualityAdjustedLifeYear {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double ql = 0;
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ql += Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken());
        }
        System.out.println(ql);
        br.close();
    }

}