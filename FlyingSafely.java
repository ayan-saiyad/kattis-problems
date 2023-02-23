import java.util.*;
import java.io.*;

public class FlyingSafely {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String test = br.readLine();

            int n = Integer.parseInt(test.split(" ")[0]);
            int m = Integer.parseInt(test.split(" ")[1]);

            for(int i = 0; i < m; i++) {
                br.readLine();
            }
            System.out.println(m < n ? m : n-1);
        }

        br.close();
        pw.close();
    }
}
