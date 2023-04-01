import java.util.*;
import java.io.*;

public class CountTheVowels {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().toLowerCase(); char[] v = {'a', 'e', 'i', 'o', 'u'}; int count = 0;
        for(int i = 0; i < line.length(); i++)
            for(char c : v)
                if(line.charAt(i) == c)
                    count++;
        System.out.println(count);
        br.close();
    }
}