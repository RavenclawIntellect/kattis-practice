import java.util.*;
import java.io.*;

public class StuckInATimeLoop {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++)
            System.out.println(i + " Abracadabra");
        br.close();
    }
}