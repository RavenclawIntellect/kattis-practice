import java.util.*;
import java.io.*;

public class SchoolBus {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int K = Integer.parseInt(st.nextToken()); int C = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> rev = new ArrayList<>();
        for(int i = 0; i < N; i++)
        {
            String person = br.readLine();
            map.put(person, i); rev.add(person);
        }
        ArrayList<ArrayList<Integer>> con = new ArrayList<>();
        for(int i = 0; i < N; i ++) con.add(new ArrayList<>());
        int[] bus = new int[N];
        Arrays.fill(bus, -1);
        int[] dg = new int[N]; boolean[] placed = new boolean[N];
        for(int i = 0; i < K; i++)
        {
             st = new StringTokenizer(br.readLine());
             int p1 = map.get(st.nextToken()); int p2 = map.get(st.nextToken());
             con.get(p1).add(p2); con.get(p2).add(p1);
             dg[p1]++; dg[p2]++;
        }
        ArrayList<Integer> occ = new ArrayList<>();
        for(int i = 0; i < N; i++)
        {
            int max = -1; int child = 0;
            for(int j = 0; j < N; j++)
                if(!placed[j] && dg[j] >= max)
                {
                     max = dg[j]; child = j;
                }
            boolean[] canVisit = new boolean[occ.size()];
            Arrays.fill(canVisit, true);
            for(int j = 0; j < occ.size(); j++)
                if(occ.get(j) == C)
                    canVisit[j] = false;
            for(int per : con.get(child))
                if(bus[per] != -1)
                    canVisit[bus[per]] = false;
            boolean placedRound = false;
            for(int j = 0; j < occ.size(); j++)
            {
                if(canVisit[j])
                {
                    bus[child] = j;
                    placed[child] = true;
                    occ.set(bus[child], occ.get(bus[child]) + 1);
                    placedRound = true;
                }
            }
            if(!placedRound)
            {
                occ.add(1); bus[child] = occ.size() - 1; placed[child] = true;
            }
        }
        System.out.println(occ.size());
        for(int i = 0; i < occ.size(); i++)
        {
            for(int j = 0; j < N; j++)
                if(bus[j] == i)
                    System.out.print(rev.get(j) + " ");
            System.out.println();
        }
        br.close();
    }
}