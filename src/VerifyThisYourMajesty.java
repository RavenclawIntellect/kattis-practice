import java.util.*;
import java.io.*;

public class VerifyThisYourMajesty {

    private static boolean check(int x1, int y1, int x2, int y2) {
        return x1 == x2 || y1 == y2 || x2 - x1 == y2 - y1 || x2 - x1 == y1 - y2;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coords = new int[N][2];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coords[i][0] = Integer.parseInt(st.nextToken()); coords[i][1] = Integer.parseInt(st.nextToken());
        }
        boolean works = true;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(check(coords[i][0], coords[i][1], coords[j][0], coords[j][1])) {
                    works = false; break;
                }
            }
        }
        System.out.println(works ? "CORRECT" : "INCORRECT");
        br.close();
    }
}