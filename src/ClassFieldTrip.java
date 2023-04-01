import java.util.*;
import java.io.*;

public class ClassFieldTrip {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine(); String b = br.readLine();
        char[] let = (a + b).toCharArray();
        Arrays.sort(let);
        System.out.println(String.valueOf(let));
        br.close();
    }
}