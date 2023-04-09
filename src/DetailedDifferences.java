import java.util.*;
import java.io.*;

public class DetailedDifferences {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0) {
            String l1 = br.readLine(); String l2 = br.readLine(); StringBuilder ans = new StringBuilder();
            for(int i = 0; i < l1.length(); i++) ans.append(l1.charAt(i) == l2.charAt(i) ? '.' : '*');
            System.out.println(l1); System.out.println(l2); System.out.println(ans); System.out.println();
        }
        br.close();
    }
}