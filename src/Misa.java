import java.util.*;
import java.io.*;

public class Misa
{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken()); int S = Integer.parseInt(st.nextToken());
        char[][] seat = new char[R][S];
        for(int i = 0; i < R; i++)
        {
            String line = br.readLine();
            for(int j = 0; j < S; j++)
                seat[i][j] = line.charAt(j);
        }
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {1, 0, -1, -1, -1, 0, 1, 1};
        int max = 0; long shake = 0;
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < S; j++)
            {
                int count = 0;
                for(int k = 0; k < 8; k++)
                {
                    int x = i + dx[k]; int y = j + dy[k];
                    if(x < 0 || x >= R || y < 0 || y >= S) continue;
                    if(seat[x][y] == 'o') count++;
                }
                if(seat[i][j] == '.') max = Math.max(max, count);
                else shake += count;
            }
        }
        System.out.println(shake / 2 + max);
        br.close();
    }
}