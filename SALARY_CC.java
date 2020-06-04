import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws IOException {
        FastReader read = new FastReader();
        int T = read.nextInt();
        while (T-- > 0) {
            int n = read.nextInt();
            int[] ar = new int[n];
            int mini = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                ar[i] = read.nextInt();
                mini = Math.min(mini, ar[i]);
            }
            int result = 0;
            for(int i = 0; i < n; i++) {
                result += ar[i]  - mini;
            }

            System.out.println(result);

        }
    }
   }
}
