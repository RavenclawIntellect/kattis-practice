import java.util.*;
import java.io.*;

public class IveBeenEverywhereMan {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            int N = Integer.parseInt(br.readLine()); HashSet<String> set = new HashSet<>();
            for(int i = 0; i < N; i++) set.add(br.readLine());
            System.out.println(set.size());
        }
        br.close();
    }
}