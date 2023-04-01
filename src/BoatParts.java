import java.util.*;

public class BoatParts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt(); int N = sc.nextInt();
        sc.nextLine();
        HashSet<String> parts = new HashSet<>();
        int d = -1;
        for(int i = 0; i < N; i++)
        {
            String p = sc.nextLine();
            if(parts.contains(p)) continue;
            parts.add(p);
            if(parts.size() == P)
            {
                d = i + 1; break;
            }
        }
        System.out.println(d == -1 ? "paradox avoided" : d);
    }
}
