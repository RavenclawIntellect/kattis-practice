import java.util.*;

public class CakeyMcCakeFace {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int M = Integer.parseInt(sc.nextLine());
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int[] in = new int[N];
        for(int i = 0; i < N; i++)
            in[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(sc.nextLine());
        int[] out = new int[M];
        for(int i = 0; i < M; i++)
        {
            out[i] = Integer.parseInt(st.nextToken());
        }
        HashMap<Integer, Integer> diff = new HashMap<>();
        for(int i = 0; i < M; i++)
            for(int j = 0; j < N; j++)
            {
                int del = out[i] - in[j];
                if(del >= 0)  diff.put(del, diff.getOrDefault(del, 0) + 1);
            }
        int max = 0; int wanted = 0;
        for(int num : diff.keySet())
        {
            if(diff.get(num) > max) {
                max = diff.get(num); wanted = num;
            }
            else if(diff.get(num) == max && num < wanted)
                wanted = num;
        }
        System.out.println(wanted);
    }
}
