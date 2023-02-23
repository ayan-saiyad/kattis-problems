import java.util.*;
import java.io.*;

public class BoatParts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        int parts = Integer.parseInt(line.split(" ")[0]);
        int n = Integer.parseInt(line.split(" ")[1]);
        HashSet<String> unique = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            unique.add(br.readLine());

            if (unique.size() == parts) {
                pw.println(i + 1);
                break;
            }
        }
        if (unique.size() != parts) {
            pw.println("paradox avoided");
        }


        br.close();
        pw.close();
    }
}
