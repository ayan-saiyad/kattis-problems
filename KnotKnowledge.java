import java.util.*;
import java.io.*;

public class KnotKnowledge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> req = new ArrayList<>(List.of(br.readLine().split(" ")));
        ArrayList<String> done = new ArrayList<>(List.of(br.readLine().split(" ")));
        for (int i = 0; i < n; i++) {
            if (done.contains(req.get(i)));
            else pw.print(req.get(i) + " ");
        }

        br.close();
        pw.close();
    }
}
