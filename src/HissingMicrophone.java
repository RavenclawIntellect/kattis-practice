import java.util.*;
import java.io.*;
import java.math.*;

public class HissingMicrophone{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String word = br.readLine(); boolean hiss = false;
        for(int i = 0; i <= word.length() - 2; i++)
            if(word.startsWith("ss", i)) {
                hiss = true;
                break;
            }
        out.println(hiss ? "hiss" : "no hiss");
        br.close(); out.close();
    }

}