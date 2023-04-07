import java.io.*;
import java.util.*;

public class TheGrandAdventure {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0)
        {
            String line = br.readLine();
            Stack<Character> bag = new Stack<>();
            boolean success = true;
            for(int i = 0; i < line.length(); i++)
            {
                char tok = line.charAt(i);
                if(tok == '.') continue;
                if(tok == '|' || tok == '$' || tok == '*')
                    bag.add(tok);
                else
                {
                    if(tok == 't') {
                        if (bag.isEmpty() || bag.pop() != '|') {
                            success = false;
                            break;
                        }
                    }
                    else if(tok == 'b') {
                        if (bag.isEmpty() || bag.pop() != '$') {
                            success = false;
                            break;
                        }
                    }
                    else if(bag.isEmpty() || bag.pop() != '*') {
                            success = false; break;
                    }
                }
            }
            if(!bag.isEmpty()) success = false;
            System.out.println(success ? "YES" : "NO");
        }
        br.close();
    }
}