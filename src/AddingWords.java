import java.util.*;
import java.io.*;

public class AddingWords {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> dict = new HashMap<>();
        HashMap<Integer, String> rev = new HashMap<>();
        while(true) {
            String line = br.readLine();
            if(line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            String com = st.nextToken();
            if(com.equals("def")) {
                String word = st.nextToken(); int num = Integer.parseInt(st.nextToken());
                if(dict.containsKey(word)) {
                    rev.remove(dict.get(word));
                }
                dict.put(word, num); rev.put(num, word);
            }
            else if(com.equals("calc")) {
                ArrayList<String> ops = new ArrayList<>();
                StringBuilder eqn = new StringBuilder();
                while(st.hasMoreTokens())  {
                    String tok = st.nextToken();
                    ops.add(tok); eqn.append(tok).append(" ");
                }
                int pos = 1; int count = 0; boolean works = dict.containsKey(ops.get(0));
                if(works) count = dict.get(ops.get(0));
                while(works && pos < ops.size()) {
                    String op = ops.get(pos);
                    if(op.equals("=")) break;
                    pos++;
                    String num = ops.get(pos);
                    pos++;
                    if(!dict.containsKey(num)) {
                        works = false; break;
                    }
                    if(op.equals("+")) count += dict.get(num);
                    else count -= dict.get(num);
                }
                if(!rev.containsKey(count)) works = false;
                if(works) eqn.append(rev.get(count));
                else eqn.append("unknown");
                System.out.println(eqn);
            }
            else {
                rev.clear(); dict.clear();
            }
        }
        br.close();
    }
}