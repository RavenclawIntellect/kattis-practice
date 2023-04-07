import java.util.*;
import java.io.*;

public class Cetvrta {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> x = new ArrayList<>(); ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken()); int Y = Integer.parseInt(st.nextToken());
            if(x.contains(X)) x.remove(new Integer(X));
            else x.add(X);
            if(y.contains(Y)) y.remove(new Integer(Y));
            else y.add(Y);
        }
        System.out.println(x.get(0) + " " + y.get(0));
        br.close();
    }
}