import java.util.*;
import java.io.*;
import java.math.*;

public class Avion {

    private static boolean isCIA(String s) {
        for(int i = 0; i <= s.length() - 3; i++) {
            if(s.startsWith("FBI", i))
                return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        boolean found = false;
        for(int i = 1; i <= 5; i++) {
            if(isCIA(br.readLine())) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if(!found) System.out.println("HE GOT AWAY!");
        br.close(); out.close();
    }

}