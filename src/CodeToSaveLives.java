import java.util.Scanner;

public class CodeToSaveLives {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); sc.nextLine();
        while(--T >= 0)
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String n1 = "", n2 = "";
            for(int i = 0; i < s1.length(); i += 2)
                n1 += s1.charAt(i);
            for(int i = 0; i < s2.length(); i += 2)
                n2 += s2.charAt(i);
            String tot = Integer.toString(Integer.parseInt(n1) + Integer.parseInt(n2));
            String ans = "";
            for(int i = 0; i < tot.length(); i++)
                ans += tot.charAt(i) + " ";
            System.out.println(ans.substring(0, ans.length() - 1));
        }
    }
}
