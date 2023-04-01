import java.util.*;
import java.io.*;

public class FYI {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().substring(0,3).equals("555") ? 1 : 0);
        br.close();
    }
}