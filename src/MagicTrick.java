import java.util.*;
import java.io.*;

public class MagicTrick {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        boolean[] single = new boolean[26];
        boolean works = true;
        for(int i = 0; i < word.length(); i++)
        {
            if(single[word.charAt(i) - 'a'])
                works = false;
            single[word.charAt(i) - 'a'] = true;
        }
        System.out.println(works ? 1 : 0);
        br.close();
    }
}