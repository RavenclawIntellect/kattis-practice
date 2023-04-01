import java.util.*;
import java.io.*;

public class SortTwoNumbers {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken());
        int[] sor = {a, b};
        Arrays.sort(sor);
        for(int i : sor) System.out.println(i + " ");
        br.close();
    }
}