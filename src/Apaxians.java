import java.io.*;

public class Apaxians {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        char c = 'A';
        String s = br.readLine();
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != c) {
                ans += s.charAt(i); c = s.charAt(i);
            }
        }
        out.println(ans);
        br.close(); out.close();
    }

}