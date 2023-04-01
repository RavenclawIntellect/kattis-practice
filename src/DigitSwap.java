import java.util.*;
import java.io.*;

public class DigitSwap {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(new StringBuilder(br.readLine()).reverse());
        br.close();
    }
}