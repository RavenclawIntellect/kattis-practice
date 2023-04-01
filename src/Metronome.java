import java.util.*;
import java.io.*;

public class Metronome {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((double) Integer.parseInt(br.readLine()) / 4);
        br.close();
    }
}
