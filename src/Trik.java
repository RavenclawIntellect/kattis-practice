import java.io.*;

public class Trik {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); int ball = 1;
        for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == 'A' && ball != 3) { ball = 3 - ball; }
            else if(line.charAt(i) == 'B' && ball != 1)  { ball = 5 - ball; }
            else if(line.charAt(i) == 'C' && ball != 2) { ball = 4 - ball; }
        }
        System.out.println(ball);
        br.close();
    }
}