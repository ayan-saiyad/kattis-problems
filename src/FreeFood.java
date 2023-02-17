import java.util.*;
import java.io.*;

public class FreeFood {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> count = new HashSet<>();
        while(n-- > 0) {
            String days = br.readLine();
            for (int i = Integer.parseInt(days.split(" ")[0]); i <= Integer.parseInt(days.split(" ")[1]); i++) {
                count.add(i);
            }
        }
        pw.println(count.size());

        br.close();
        pw.close();
    }
}
