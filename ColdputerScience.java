import java.util.*;
import java.io.*;

public class ColdputerScience {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) < 0) {
                count++;
            }
        }
        pw.println(count);


        br.close();
        pw.close();
    }
}
