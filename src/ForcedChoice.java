import java.util.Scanner;
import java.util.StringTokenizer;

public class ForcedChoice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        st.nextToken(); String P = st.nextToken(); int S = Integer.parseInt(st.nextToken());
        while(--S >= 0)
        {
            String cut = sc.nextLine();
            st = new StringTokenizer(cut);
            boolean keep = false;
            st.nextToken();
            while(st.hasMoreTokens()) if(st.nextToken().equals(P)) keep = true;
            System.out.println(keep ? "KEEP" : "REMOVE");
        }
    }
}
