import java.util.*;
import java.io.*;

public class Betting {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double per = Integer.parseInt(br.readLine()) / 100.0;
        System.out.println(1 / per);
        System.out.println(1 / (1 - per));
        br.close();
    }
}
