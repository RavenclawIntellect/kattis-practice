import java.util.*;
import java.io.*;

public class Watchdog {

    private static boolean canReach(int x, int y, int X, int Y, int d) {
        return (int) Math.pow(X - x, 2) + (int) Math.pow(Y - y, 2) <= (int) Math.pow(d, 2);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken()); int H = Integer.parseInt(st.nextToken());
            int[][] coords = new int[H][2];
            for(int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); int y = Integer.parseInt(st.nextToken());
                coords[i][0] = x; coords[i][1] = y;
            }
            boolean works = false;
            for(int X = 0; X <= S; X++) {
                for(int Y = 0; Y <= S; Y++) {
                    int minD = Math.min(Math.min(Math.min(X, Y), Math.abs(S - X)), Math.abs(S - Y));
                    boolean end = true;
                    for(int i = 0; i < H; i++) {
                        int x = coords[i][0]; int y = coords[i][1];
                        if(X == x && Y == y) {
                            end = false; break;
                        }
                        if(!canReach(x, y, X, Y, minD)) {
                            end = false; break;
                        }
                    }
                    if(end) {
                        works = true; System.out.println(X + " " + Y);
                    }
                    if(works) break;
                }
                if(works) break;
            }
            if(!works) System.out.println("poodle");
        }
        br.close();
    }
}