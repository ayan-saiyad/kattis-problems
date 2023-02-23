import java.util.*;
import java.io.*;

public class IveBeenEverywhere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int s = Integer.parseInt(br.readLine());
        while (s > 0) {
            int n = Integer.parseInt(br.readLine());
            HashSet now = new HashSet<>();
            for (int j = 0; j < n; j++) {
                now.add(br.readLine());
            }
            pw.println(now.size());
            now.clear();
            s--;
        }

        br.close();
        pw.close();
    }
}
