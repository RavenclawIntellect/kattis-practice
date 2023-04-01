import java.util.*;
import java.io.*;

public class NPuzzle {

    public static ArrayList<Integer> find(char c, char[][] table)
    {
        for(int i = 0; i < table.length; i++)
            for(int j = 0; j < table[i].length; j++)
                if(table[i][j] == c)
                {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(i); temp.add(j);
                    return temp;
                }
        return null;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] table = new char[4][4];
        for(int i = 0; i < 4; i++)
        {
            String line = br.readLine();
            for(int j = 0; j < 4; j++)
                table[i][j] = line.charAt(j);
        }
        int sum = 0;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(i == 3 && j == 3) break;
                ArrayList<Integer> loc = find((char) (4 * i + j + 'A'), table);
                int r = loc.get(0); int c = loc.get(1);
                sum += Math.abs(r - i) + Math.abs(c - j);
            }
        }
        System.out.println(sum);
        br.close();
    }
}