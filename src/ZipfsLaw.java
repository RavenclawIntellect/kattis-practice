import java.util.*;
import java.io.*;

public class ZipfsLaw {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String firstLine = br.readLine();
            if(firstLine == null) break;
            int N = Integer.parseInt(firstLine);
            HashMap<String, Integer> map = new HashMap<>();
            while(true) {
                String line = br.readLine();
                if(line.equals("EndOfText")) break;
                String[] split = line.split("[^a-zA-Z]");
                for(String tok : split) {
                    tok = tok.toLowerCase();
                    map.put(tok, map.getOrDefault(tok, 0) + 1);
                }
            }
            ArrayList<String> list = new ArrayList<>();
            for(String s : map.keySet())
                if(map.get(s) == N) list.add(s);
            Collections.sort(list);
            if(list.size() == 0) System.out.println("There is no such word.");
            else {
                for(String s : list) System.out.println(s);
            }
            System.out.println();
        }
        br.close();
    }
}