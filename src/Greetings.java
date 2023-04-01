import java.util.*;
import java.io.*;

public class Greetings {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String e = "";
        for(int i = 0; i < line.length() - 2; i++) e += "ee";
        System.out.println("h" + e + "y");
        br.close();
    }
}
