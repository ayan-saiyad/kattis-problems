import java.util.*;
import java.io.*;

public class CodeToSaveLives {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int a = Integer.parseInt(br.readLine().replaceAll("\\s", ""));
            int b = Integer.parseInt(br.readLine().replaceAll("\\s", ""));

            char[] sum = Integer.toString(a+b).toCharArray();
            for (char c : sum) {
                pw.print(c + " ");
            }
            pw.println();
        }

        br.close();
        pw.close();
    }
}
