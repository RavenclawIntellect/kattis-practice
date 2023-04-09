import java.io.*;

public class CryptographersConundrum {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); char[] arr = {'P', 'E', 'R'};
        int count = 0; for(int i = 0; i < line.length(); i++) if(line.charAt(i) != arr[i % 3]) count++;
        System.out.println(count);
        br.close();
    }
}