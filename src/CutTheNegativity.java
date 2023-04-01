import java.util.*;
import java.io.*;

public class CutTheNegativity {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int count = 0;
        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N; j++)
            {
                int num = Integer.parseInt(st.nextToken());
                if(num > 0) count++;
                arr[i][j] = num;
            }
        }
        System.out.println(count);
        for(int i = 1; i <= N; i++)
            for(int j = 1; j <= N; j++)
                if(arr[i-1][j-1] > 0)
                    System.out.println(i + " " + j + " " + arr[i-1][j-1]);
        br.close();
    }
}