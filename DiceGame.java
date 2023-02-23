import java.util.*;
import java.io.*;

public class DiceGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum1 = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
                + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int sum2 = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
                + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        pw.println(sum1 > sum2 ? "Gunnar" : (sum2 > sum1)? "Emma" : "Tie");

        br.close();
        pw.close();
    }
}
