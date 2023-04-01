import java.util.*;
import java.io.*;

public class ArmyStrengthHard {

    public static boolean fight(int[] l, int[] u)
    {
        int sL = l.length; int sU = u.length;
        int lC = 0; int  uC = 0;
        while(lC < sL && uC < sU)
        {
            if(l[lC] < u[uC]) lC++;
            else uC++;
        }
        return uC == sU;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while(--testcases >= 0)
        {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int G = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken());
            int[] sG = new int[G]; int[] sM = new int[M];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < G; i++)
                sG[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++)
                sM[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(sG); Arrays.sort(sM);
            boolean gW = fight(sG, sM);
            if(gW) System.out.println("Godzilla");
            else System.out.println("MechaGodzilla");
        }
        br.close();
    }
}