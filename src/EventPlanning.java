import java.util.*;

public class EventPlanning
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int B = sc.nextInt(); int H = sc.nextInt(); int W = sc.nextInt();
        long minP = Long.MAX_VALUE; boolean change = false;
        for(int i = 0; i < H; i++)
        {
            int cost = sc.nextInt();
            int min = -1; int stay = 0;
            for(int j = 0; j < W; j++)
                stay = Math.max(stay, sc.nextInt());
            if(stay >= N && (long) N * cost <= B) {
                change = true;
                minP = Math.min(minP, (long) N * cost);
            }
        }
        System.out.println(change ? minP : "stay home");
    }
}
