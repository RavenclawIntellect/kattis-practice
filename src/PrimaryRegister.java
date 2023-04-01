import java.util.*;
import java.io.*;

public class PrimaryRegister {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
        long[] numList = new long[8];
        long count = 1;
        for(int i = 0; i < 8; i++)
        {
            numList[i] = count;
            count *= primes[i];
        }
        long state = 0;
        for(int i = 0; i < 8; i++)
        {
            state += numList[i] * sc.nextLong();
        }
        System.out.println(19 * numList[7] - state - 1);
    }
}
