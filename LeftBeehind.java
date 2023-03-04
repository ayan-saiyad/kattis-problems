import java.util.*;
import java.io.*;

public class LeftBeehind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        while (true) {

            String line = br.readLine();
            if (line.equals("0 0")) break;

            StringTokenizer st = new StringTokenizer(line);
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

            if (x + y == 13) pw.println("Never speak again.");
            else if (x > y) pw.println("To the convention.");
            else if (x < y) pw.println("Left beehind.");
            else if (x == y) pw.println("Undecided.");

        }


        br.close();
        pw.close();
    }
}
