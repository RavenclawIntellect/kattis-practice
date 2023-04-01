import java.util.*;
import java.io.*;

public class FindingAnA{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        for(int i = 0; i < line.length(); i++)
        {
            if(line.charAt(i) == 'a')
            {
                System.out.println(line.substring(i)); return;
            }
        }
        br.close();
    }

}