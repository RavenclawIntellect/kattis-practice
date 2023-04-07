import java.util.*;
import java.io.*;

public class CircuitMath {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] dat = new boolean[N];
        for(int i = 0; i < N; i++)
            dat[i] = st.nextToken().equals("T");
        st = new StringTokenizer(br.readLine());
        Stack<Boolean> comp = new Stack<>();
        while(st.hasMoreTokens())
        {
            String op = st.nextToken();
            if(op.matches("[a-zA-Z]")) {
                comp.add(dat[op.charAt(0) - 'A']);
            }
            else if(op.equals("*")) {
                boolean b1 = comp.pop(); boolean b2 = comp.pop();
                comp.add(b1 && b2);
            }
            else if(op.equals("+")) {
                boolean b1 = comp.pop(); boolean b2 = comp.pop();
                comp.add(b1 || b2);
            }
            else
                comp.add(!comp.pop());
        }
        System.out.println(comp.pop() ? "T" : "F");
        br.close();
    }
}