import java.util.*;
import java.io.*;

public class DetailedDIfferences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();
            pw.println(s1);
            pw.println(s2);
            char[] line1 = s1.toCharArray();
            char[] line2 = s2.toCharArray();
            for (int i = 0; i < line1.length; i++) {
                pw.print(line1[i] == line2[i]? "." : "*");
            }
            pw.println("\n");
            n--;
        }
        br.close();
        pw.close();
    }
}
