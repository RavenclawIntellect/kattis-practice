import java.util.*;
import java.io.*;

public class DelimiterSoup {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String delim = br.readLine();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < L; i++) {
            char c = delim.charAt(i);
            switch(c) {
                case '{':
                case '[':
                case '(':
                    stack.add(c);
                    break;
                case '}':
                    if (stack.size() == 0 || stack.pop() != '{') {
                        System.out.println("} " + i);
                        return;
                    }
                    break;
                case ']':
                    if (stack.size() == 0 || stack.pop() != '[') {
                        System.out.println("] " + i);
                        return;
                    }
                    break;
                case ')':
                    if (stack.size() == 0 || stack.pop() != '(') {
                        System.out.println(") " + i);
                        return;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("okay so far");
        br.close();
    }
}