import java.util.*;
import java.io.*;

public class Problems99 {

    public static void main(String[] args) throws IOException{
        //This code TLEs on Java, however upon conversion to C++, it works in time
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int Q = Integer.parseInt(st.nextToken());
        TreeMap<Integer, Integer> diff = new TreeMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            diff.put(num, diff.getOrDefault(num, 0) + 1);
        }
        for(int i = 0; i < Q; i++)
        {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken()); int D = Integer.parseInt(st.nextToken());
            if(T == 1)
            {
                Integer key = diff.ceilingKey(D + 1);
                if(key == null) System.out.println(-1);
                else {
                    int count = diff.get(key);
                    if(count == 1) diff.remove(key);
                    else diff.put(key, count - 1);
                    System.out.println(key);
                }
            }
            else
            {
                Integer key = diff.floorKey(D);
                if(key == null) System.out.println(-1);
                else {
                    int count = diff.get(key);
                    if(count == 1) diff.remove(key);
                    else diff.put(key, count - 1);
                    System.out.println(key);
                }
            }
        }
        br.close();
    }
}