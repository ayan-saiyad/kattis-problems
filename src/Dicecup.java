import java.util.*;
import java.io.*;

public class Dicecup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        for (int i = n + 1; i < m + 2; i++) {
            System.out.println(i);
        }



    }
}
