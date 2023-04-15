import java.util.*;
import java.io.*;
import java.math.*;

public class IsItHalloween {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line = br.readLine();
        System.out.println(line.equals("OCT 31") || line.equals("DEC 25") ? "yup" : "nope");
        br.close(); out.close();
    }

}