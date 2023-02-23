package src;

import java.util.*;
import java.io.*;

public class ADiffProb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line;
        while(true) {
            line = br.readLine();
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line);
            long one = Long.parseLong(st.nextToken());
            long two = Long.parseLong(st.nextToken());
            pw.println(Math.abs(one - two));
    }
        br.close();
        pw.close();
    }
}
