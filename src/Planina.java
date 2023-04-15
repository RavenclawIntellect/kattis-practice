import java.util.*;
import java.io.*;
import java.math.*;

public class Planina{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        out.println((long) Math.pow(Math.pow(2, Integer.parseInt(br.readLine())) + 1, 2));
        br.close(); out.close();
    }

}