import java.util.*;
import java.io.*;

public class Ladder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        pw.println((int)Math.ceil(h/Math.sin(Math.toRadians(v))));

        br.close();
        pw.close();
    }
}
