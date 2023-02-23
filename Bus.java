import java.util.*;
import java.io.*;

public class Bus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            double sum = 0;

            for (int i = 0; i < k+1; i++) {
                sum = sum * 2 + 0.5;
            }
            pw.println((int)sum);
        }

        br.close();
        pw.close();
    }
}
