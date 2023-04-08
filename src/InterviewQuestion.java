import java.util.*;
import java.io.*;

public class InterviewQuestion {

    private static int solve(ArrayList<Integer> nums, int c, int d)
    {
        if(nums.size() >= 2) return nums.get(1) - nums.get(0);
        else if(nums.size() == 1) return nums.get(0);
        else return (d + 1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken()); int d = Integer.parseInt(st.nextToken());
        ArrayList<Integer> fizz = new ArrayList<>(); ArrayList<Integer> buzz = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = c; i <= d; i++) {
            String text = st.nextToken();
            if(text.equals("FizzBuzz") || text.equals("Fizz")) fizz.add(i);
            if(text.equals("FizzBuzz") || text.equals("Buzz")) buzz.add(i);
        }
        System.out.println(solve(fizz, c, d) + " " + solve(buzz, c, d));
        br.close();
    }
}