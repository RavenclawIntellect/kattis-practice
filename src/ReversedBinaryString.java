import java.util.*;
import java.io.*;

public class ReversedBinaryString {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(new StringBuilder(Integer.toString(Integer.parseInt(br.readLine()), 2)).reverse().toString(), 2));
        br.close();
    }
}