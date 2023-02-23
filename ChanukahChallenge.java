import java.util.*;
import java.io.*;

public class ChanukahChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            int candle = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int j = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());

            for (int i = 0; i < day; i++) {
                candle += i + 2;
            }

            pw.println(j + " " + candle);
        }



        br.close();
        pw.close();
    }
}
