import java.util.*;
import java.io.*;

public class AlphabetSpam {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int w, l, u, s;
        w = l = u = s = 0;
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(c == '_') w++;
            else if(c >= 'a' && c <= 'z') l++;
            else if(c >= 'A' && c <= 'Z') u++;
            else s++;
        }
        double tot = w + l + u + s;
        System.out.println(w / tot);
        System.out.println(l / tot);
        System.out.println(u / tot);
        System.out.println(s / tot);
        br.close();
    }
}