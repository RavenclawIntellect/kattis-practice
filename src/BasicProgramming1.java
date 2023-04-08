import java.util.*;
import java.io.*;

public class BasicProgramming1 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int T = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(st.nextToken());
        if(T == 1) out.println(7);
        else if(T == 2) out.println(nums[0] > nums[1] ? "Bigger" : nums[0] == nums[1] ? "Equal" : "Smaller");
        else if(T == 3) {
            int[] med = {nums[0], nums[1], nums[2]};
            Arrays.sort(med);
            out.println(med[1]);
        }
        else if(T == 4) {
            long sum = 0;
            for(int i : nums) sum += i;
            out.println(sum);
        }
        else if(T == 5) {
            long sum = 0;
            for(int i : nums) if(i % 2 == 0) sum += i;
            out.println(sum);
        }
        else if(T == 6) {
            for(int i : nums) out.print((char) (i % 26 + 'a'));
        }
        else {
            boolean[] visited = new boolean[N];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(0); boolean end = false;
            while(!queue.isEmpty()) {
                int pop = queue.poll();
                if(pop == N - 1) {
                    out.println("Done"); break;
                }
                visited[pop] = true;
                if(nums[pop] < 0 || nums[pop] >= N) {
                    System.out.println("Out"); end = true; break;
                }
                if(visited[nums[pop]]) {
                    System.out.println("Cyclic"); end = true; break;
                }
                queue.add(nums[pop]);
            }
        }
        br.close();
        out.close();
    }
}