import java.util.*;
import java.io.*;

public class SquarePeg {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sq = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());

        pw.println((2 * r * Math.sin(Math.toRadians(45)) > sq) ? "fits" : "nope");



        br.close();
        pw.close();
    }
}
