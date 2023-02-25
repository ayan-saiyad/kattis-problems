import java.util.*;
import java.io.*;

public class JudgingMoose {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        if (l == 0 && r == 0) pw.println("Not a moose");
        else if (l != r) pw.println("Odd " + ((l > r) ? l * 2 : r * 2));
        else if (l == r) pw.println("Even " + (l + r));


        br.close();
        pw.close();
    }
}
