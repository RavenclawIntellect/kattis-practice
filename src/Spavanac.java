import java.util.*;
import java.io.*;

public class Spavanac {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        if(time < 45) time += 1440;
        time -= 45;
        System.out.println((time / 60) + " " + (time % 60));
        br.close();
    }
}