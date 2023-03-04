import java.util.*;
import java.io.*;

public class LastFactorialDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int sum = 1;
            int num = Integer.parseInt(br.readLine());
            for (int i = 1; i <= num; i++) {
                sum *= i;
            }
            pw.println(sum%10);
        }

        br.close();
        pw.close();
    }
}
